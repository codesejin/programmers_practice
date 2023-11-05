package LV_0.특별한이차원배열1;

import java.util.Arrays;

public class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        int n = 3;
        System.out.println(Arrays.deepToString(T.solution(n)));
    }
}
