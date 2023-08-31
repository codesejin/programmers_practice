package LV_0.숨어있는숫자의덧셈2;

import java.util.Arrays;

public class Test2 {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split("[a-zA-Z]");
        for(int i = 0 ; i < str.length;i++){
            if(str[i].length() > 0)
                answer+=Integer.parseInt(str[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        Test2 s = new Test2();
        String my_string = "aAb1B2cC34oOp";
        String my_string2 = "1a2b3c4d123Z";
        String my_string3 = "122a3bcd123";
        s.solution(my_string3);
    }
}
