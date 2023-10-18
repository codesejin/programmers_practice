package LV_2.올바른괄호.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] ch = s.toCharArray();

        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(') q.offer('(');
            else {
                if (q.isEmpty()) return false;
                else {
                   q.poll();
                }
            }
        }
        if (!q.isEmpty())return false;
        return answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        String s1 = "(())()"; // true
        String s2 = ")()("; // false
        System.out.println(T.solution(s2));
    }
}
