package LV_2.올바른괄호.Stack;

import java.util.Stack;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < charArray.length; i++) {
            // 열린괄호
            if (charArray[i] == '(') stack.push('(');
            // 닫힌 괄호
            else {
                if (stack.isEmpty()) return false;
                else stack.pop();
            }
        }
        System.out.println(stack);
        if (!stack.isEmpty()) return false;
        else return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String s1 = "(())()"; // true
        String s2 = ")()("; // false
        System.out.println(T.solution(s2));
    }

}
