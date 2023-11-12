package LV_0.유한소수판별하기;

public class Solution {
    public int solution(int a, int b) {
        int answer = 2; // 무한소수
        int min = Math.min(a, b);
        int gcd = 0; // 최대공약수
        for (int i = 1; i <= min ; i++) {
            if (a % i == 0 && b % i == 0) gcd = Math.max(gcd, i);
        }
        System.out.println("gcd :" + gcd);
//        System.out.println(a/(float)b);
        return (a % b >= 0.0001)? 1 : 2;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int a = 12;
        int b = 21;
        System.out.println(T.solution(a,b));
    }
}
