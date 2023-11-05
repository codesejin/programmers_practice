package LV_0.간단한식계산하기;

import java.util.Arrays;

public class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] split = binomial.split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[2]);
        switch (split[1]) {
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*" : answer = a * b;
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String binomial1 = "43 + 12";
        String binomial2 = "0 - 7777";
        System.out.println(T.solution(binomial1));
    }
}
