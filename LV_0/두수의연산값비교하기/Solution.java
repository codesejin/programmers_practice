package LV_0.두수의연산값비교하기;

public class Solution {
    public int solution(int a, int b) {
        int first = Integer.parseInt(a + "" + b);
        int second = 2 * a * b;
        return Math.max(first, second);
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        int a = 91;
        int b = 2;
        System.out.println(T.solution(a,b));
    }
}
