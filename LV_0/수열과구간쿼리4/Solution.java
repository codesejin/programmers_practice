package LV_0.수열과구간쿼리4;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            // 열은 고정, 행은 몇번까지 있을지 모르니까 i로 입력
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            for (int j = s; j <= e; j++) {
                if (j % k == 0) {
                    arr[j] += 1;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1},{0, 3, 2},{0, 3, 3}};
        System.out.println(Arrays.toString(s.solution(arr,queries)));
    }
}
