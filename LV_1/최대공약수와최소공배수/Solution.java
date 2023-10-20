package LV_1.최대공약수와최소공배수;

import java.util.Arrays;

public class Solution {
    public int[] solution(int n, int m) {
        // 최대공약수 : 두 수가 서로 공통으로 가지고 있는 약수 중 가장 큰 수
        // 약수 : 어떤 수를 나누었을 때 나누어떨어지게 하는 자연수
        // 최대공배수 : 두 수에 서로 공통으로 존재하는 배수 중 가장 작은 수
        int min = Math.min(n, m);
        int gcd = 0; // 최대공약수
        for (int i = 1; i <= min ; i++) {
            if (n % i == 0 && m % i == 0) gcd = Math.max(gcd, i);
        }

        int lcm = (n*m)/gcd; // 최대공배수
        return new int[]{gcd, lcm};
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int n1 = 3;
        int m1= 12;
        int n2 = 2;
        int m2= 5;
        System.out.println(Arrays.toString(T.solution(n1,m1)));
    }
}
