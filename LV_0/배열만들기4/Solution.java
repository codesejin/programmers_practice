package LV_0.배열만들기4;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (i < arr.length) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
                i++;
            } else if (!stack.isEmpty() && arr[i] > stack.peek()) {
                stack.push(arr[i]);
                i++;
            } else if (!stack.isEmpty() && arr[i] <= stack.peek()) {
                stack.pop();
            }
        }
        stk = new int[stack.size()];
        for (int j = stack.size()-1; j >=0; j--) {
            stk[j] = stack.pop();
        }
        return stk;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(Arrays.toString(T.solution(arr)));
    }
}
