package LV_0.이차원으로만들기;

import java.util.Arrays;

public class Solution1 {
    public int[][] solution(int[] num_list, int n) {
        int half = num_list.length / 2;
        int[][] answer = new int[half][n];

        int idx = 0;
        for (int i = 0; i < half; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[idx++];
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;
        Solution1 solution1 = new Solution1();
        solution1.solution(num_list, n);
    }
}
