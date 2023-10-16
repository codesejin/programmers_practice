package LV_0.원소들의곱과합;

import java.util.Arrays;

public class Solution {
    public int solution(int[] num_list) {
        int sum = Arrays.stream(num_list).sum();
        int multiply = Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
        return multiply < Math.pow(sum,2) ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] num_list = {3, 4, 5, 2, 1};
        System.out.println(T.solution(num_list));
    }
}
