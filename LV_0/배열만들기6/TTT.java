package LV_0.배열만들기6;

import java.util.*;

public class TTT {

    class Parentheses {
        private int location;
        private char parentheses;

        public Parentheses(int location, char parentheses) {
            this.location = location;
            this.parentheses = parentheses;
        }
    }

    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Parentheses> stack = new Stack<>();
        List<Integer> idx = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(new Parentheses(i, c));
                idx.add(i);
            }
            if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                    idx.add(i);
                }
            }
        }
        for (Parentheses x : stack) {
            System.out.print(x.location + " ");
        }
        System.out.println(idx);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isAlphabetic(c) && idx.contains(i)) {
                if (!stack.isEmpty() && stack.peek().location == i) {
                    stack.pop(); // 해당 위치의 괄호가 유효하면 스택에서 제거
                    continue;
                } else {
                    System.out.println(i);
                    sb.append(c);
                }
            }
            if (Character.isAlphabetic(c)) sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        TTT T = new TTT();
        String s1 = "lee(t(c)o)de)";
        String s2 = "a)b(c)d";
        String s3 = "(a(b(c)d)";
        String s4 = "))((";
        String s5 = "())()(((";
        System.out.println(T.minRemoveToMakeValid(s5));
    }
}
