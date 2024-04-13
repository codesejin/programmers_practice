package LV_2.피보나치수;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] pivo = new int[n+1];
        pivo[0] = 0;
        pivo[1] = 1;
        for(int i = 2; i <= n; i ++) {
            pivo[i] = (pivo[i-1] + pivo[i-2]) % 1234567;
        }
        return pivo[n];
    }
}
