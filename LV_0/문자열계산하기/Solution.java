package LV_0.문자열계산하기;


public class Solution {
    public int solution(String my_string) {
        String[] split = my_string.split(" ");
        int answer = Integer.parseInt(split[0]);

        for (int i = 1; i < split.length; i++) {
            if (split[i].equals("+")) answer += Integer.parseInt(split[i+1]);
            // else만 하면 안됨, 왜냐하면 원소에는 숫자도 있으니까
            else if (split[i].equals("-")) answer -= Integer.parseInt(split[i+1]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String my_string = "3 + 4";
        System.out.println(T.solution(my_string));
    }
}
