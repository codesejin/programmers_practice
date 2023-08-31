package LV_0.숨어있는숫자의덧셈2;

public class Test1 {
    public int solution(String my_string) {
        int answer = 0;

        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for(String s : str){
            if(!s.equals("")) answer += Integer.valueOf(s);
        }

        return answer;
    }
    public static void main(String[] args) {
        Test1 s = new Test1();
        String my_string = "aAb1B2cC34oOp";
        String my_string2 = "1a2b3c4d123Z";
        String my_string3 = "122a3bcd123";
        s.solution(my_string3);
    }
}
