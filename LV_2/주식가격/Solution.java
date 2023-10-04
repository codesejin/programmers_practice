package LV_2.주식가격;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }
        System.out.println(stack);
        while (!stack.isEmpty()) {
            int leftIdx = stack.pop();
            System.out.println(leftIdx);
            answer[leftIdx] = prices.length-leftIdx-1;
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        int[] prices = {1, 2, 3, 2, 3};
        System.out.println(Arrays.toString(T.solution(prices)));
    }
}
