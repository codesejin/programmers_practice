package LV_0.순서바꾸기;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int idx = 0;
        for (int i = n; i < num_list.length; i++) {
            answer[idx++] = num_list[i];
        }
        for (int i = 0; i < n; i++) {
            answer[idx++] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] num_list1 = {2,1,6};
        int n1 = 1;
        int[] num_list2 = {5, 2, 1, 7, 5};
        int n2 = 3;
        System.out.println(Arrays.toString(T.solution(num_list1,n1)));
    }
}
