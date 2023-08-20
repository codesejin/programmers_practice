package LV_0.수열과구간쿼리1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
    public int[] solution(int[] arr, int[][] queries) {
//        // 테스트 케이스만 성공하고 진짜는 실패
//        for (int i = 0; i < queries.length; i++) {
//            for (int j = 0; j < queries[i].length; j++) {
//                int wow = queries[i][j];
//                arr[wow] = arr[wow] + 1;
//            }
//        }
//        System.out.println("answer = " + Arrays.toString(arr));
//        return arr;
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            for (int j = start; j <= end; j++) {
                arr[j] = arr[j] + 1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 1}, {1, 2}, {2, 3}};
        Solution1 solution1 = new Solution1();
        solution1.solution(arr, queries);
    }
}
