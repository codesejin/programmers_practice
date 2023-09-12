package LV_0.수열과구간쿼리3;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int num = 0; num < queries.length; num++) {
            int i = arr[queries[num][0]];
            int j = arr [queries[num][1]];
            arr[i] = j;
            arr[j] = i;
        }

        return arr;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3},{1, 2},{1, 4}};
        System.out.println(Arrays.toString(s.solution(arr,queries)));
    }
}
