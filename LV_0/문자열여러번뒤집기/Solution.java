package LV_0.문자열여러번뒤집기;

import java.util.Arrays;

public class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            while (start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}}; //s부터 e까지 뒤집어라
        System.out.println(T.solution(my_string, queries));
    }
}
