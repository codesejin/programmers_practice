package LV_0.수열과구간쿼리3;

import java.util.Arrays;

public class Other1 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];

            int temp = answer[i];
            answer[i] = answer[j];
            answer[j] = temp;
        }

        return answer;
    }

    public static void main(String[] args) {
        Other1 s = new Other1();
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
        System.out.println(Arrays.toString(s.solution(arr, queries)));
    }
}
