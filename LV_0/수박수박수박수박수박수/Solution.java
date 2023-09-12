package LV_0.수박수박수박수박수박수;

public class Solution {

    public String solution(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) sb.append("박");
            else sb.append("수");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 3;
        System.out.println(s.solution(n));

    }

}
