package LV_0.길이에따른연산;

import java.util.Arrays;

public class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list.length >= 11) answer += num_list[i];
            else answer *= num_list[i];
        }
        return num_list.length >= 11 ? answer - 1: answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        int[] num_list2 = {2, 3, 4, 5};
        System.out.println(T.solution(num_list2));
    }
}
