package LV_2.최솟값만들기;

import java.util.Arrays;

public class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;
        int len = A.length;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < len / 2; i++) {
            int temp = B[i];
            B[i] = B[len - i - 1];
            B[len - i - 1] = temp;
        }

        for (int i = 0; i < len; i++) {
            answer += A[i] * B[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        int[] A={1, 4, 2};
        int[] B={5, 4, 4};
        System.out.println(T.solution(A,B));
    }
}