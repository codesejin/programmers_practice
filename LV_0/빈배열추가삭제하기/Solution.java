package LV_0.빈배열추가삭제하기;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            if (flag[i] == true) {
                tmp = tmp * 2;
                while(tmp != 0) {
                    stack.push(arr[i]);
                    tmp --;
                }
            } else {
                while (tmp != 0) {
                    stack.pop();
                    tmp --;
                }
            }
        }

        return stack.stream().mapToInt( i -> i).toArray();
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        System.out.println(Arrays.toString(T.solution(arr,flag)));
    }
}
