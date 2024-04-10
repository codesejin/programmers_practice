package LV_1.이상한문자만들기;

public class Solution {

    public String solution(String s) {
        String answer = "";
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);
            if(Character.isAlphabetic(target)) {
                if(num % 2 == 0) {
                    answer += Character.toUpperCase(target);
                    num++;
                } else {
                    answer += Character.toLowerCase(target);
                    num++;
                }
            } else {
                answer += target;
                num = 0;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Solution T = new Solution();
        String s= "try hello world"; // 각 단어의 짝수번째 대문자, 홀수번째 소문자
        String s1= "try  hello world"; // 각 단어의 짝수번째 대문자, 홀수번째 소문자
        System.out.println(T.solution(s1));
    }
}
