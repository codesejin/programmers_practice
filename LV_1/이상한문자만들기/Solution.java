package LV_1.이상한문자만들기;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    public String solution(String s) {
        String answer = "";
        String[] split = s.split("");

        int idx = 0;
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(" ")) {
                idx = 0;
            } else if (idx % 2 == 0) {
                split[i] = split[i].toUpperCase();
                idx++;
            } else {
                split[i] = split[i].toLowerCase();
                idx++;
            }
            answer += split[i];
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
