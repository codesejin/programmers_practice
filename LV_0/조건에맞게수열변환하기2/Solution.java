package LV_0.조건에맞게수열변환하기2;

import java.util.Arrays;

public class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        for (int j = 1; j <= arr.length; j++) {
            int[] ints = Arrays.copyOf(arr, arr.length);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                } else if (arr[i] <= 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            if (Arrays.equals(ints, arr)) {
                answer = j - 1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 2, 3, 100, 99, 98};
        System.out.println(s.solution(arr));
    }
}
