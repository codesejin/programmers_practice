package LV_0.간단한논리연산;

public class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        // 교집합일 경우 false로 초기화
        boolean answer = false;
        // 합집할일 경우 true로 초기화
        boolean first = true;
        boolean last = true;
        if (x1 == x2) first = x1;
        if (x3 == x4) last = x3;

        if (first == last) answer = first;

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        boolean x1 = false;
        boolean x2 = true;
        boolean x3 = true;
        boolean x4 = true;
        System.out.println(s.solution(x1, x2, x3, x4));
    }
}
