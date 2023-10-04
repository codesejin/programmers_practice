package LV_1.같은숫자는싫어;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public int[] solution(int[] arr) {
//        Stack<Integer> stack = new Stack<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i > 0 && arr[i] == stack.peek()) stack.pop();
//            stack.push(arr[i]);
//        }
//
//        int[] answer = new int[stack.size()];
//
//        for (int i = stack.size()-1; i >= 0; i--) {
//            answer[i] = stack.pop();
//        }

        Queue<Integer> Q = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                Q.offer(arr[i]);
            }
        }

        int[] answer = new int[Q.size()];
        int idx = 0;
        while (!Q.isEmpty()) {
            answer[idx++] = Q.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(T.solution(arr)));
    }

}
