package LV_0.정사각형으로만들기;

import java.util.Arrays;

public class Solution {
    public int[][] solution(int[][] arr) {
        int max = Math.max(arr.length, arr[0].length);

        int[][] answer = new int[max][max];
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                if (i < arr.length && j < arr[i].length) answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        int[][] arr1 = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
        System.out.println(Arrays.deepToString(T.solution(arr1)));
    }
}
