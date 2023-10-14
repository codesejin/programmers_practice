package LV_0.제곱수판별하기;

public class Solution {
    public int solution(int n) {
        int answer = 1;
        double sqrt = Math.sqrt(n);
        if (sqrt % 1 != 0 ) answer = 2;
        return answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        int n = 144;
        int n2 = 976;
        System.out.println(T.solution(n2));
    }
}
