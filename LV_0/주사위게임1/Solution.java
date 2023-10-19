package LV_0.주사위게임1;

public class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if (a % 2 != 0 && b % 2 != 0) answer = (int) (Math.pow(a,2) + Math.pow(b,2));
        else if (a % 2 != 0 || b % 2 != 0) answer = 2 * (a+b);
        else answer = Math.abs(a-b);
        return answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        int a=6;
        int b=1;
        System.out.println(T.solution(a, b));
    }
}
