package LV_2.최댓값과최솟값;

import java.util.Arrays;

public class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] split = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (String x : split) {
            min = Math.min(min, Integer.parseInt(x));
            max = Math.max(max, Integer.parseInt(x));
        }
        return sb.append(min).append(" ").append(max).toString();
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String s = "1 2 3 4";
        System.out.println(T.solution(s));
    }
}
