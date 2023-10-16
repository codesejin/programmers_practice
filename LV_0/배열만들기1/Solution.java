package LV_0.배열만들기1;

public class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (i % k ==0) answer[idx++] =i;
        }
        // 분기처리 안해도 할 수 있음
//        int count = n / k;
//        int[] answer = new int[count];
//        for (int i = 1; i <= count; i++) {
//            answer[i - 1] = k * i;
//        }
        return answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        int n = 15;
        int k = 5;
        T.solution(n,k);
    }
}
