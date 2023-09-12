package LV_0.배열의길이를2의거듭제곱으로만들기;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;

        // arr의 길이 이상의 2 거듭제곱으로 만들기
        int tmp = 1;
        while (tmp < length) {
            tmp *= 2;
        }
        // int배열의 초기값은 0으로 세팅
        int[] answer = new int[tmp];

        for (int i = 0; i < length ; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[]{58, 172, 746, 89};
        System.out.println(Arrays.toString(solution.solution(arr2)));
    }
}
