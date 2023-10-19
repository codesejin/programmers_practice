package LV_0.n번째원소까지;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 3;
        System.out.println(Arrays.toString(T.solution(num_list, n)));
    }
}
