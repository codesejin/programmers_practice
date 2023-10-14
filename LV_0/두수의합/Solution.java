package LV_0.두수의합;

import java.math.BigInteger;

public class Solution {
    public String solution(String a, String b) {
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        return String.valueOf(bigA.add(bigB));
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String a = "582";
        String b = "734";
        System.out.println(T.solution(a, b));
    }
}
