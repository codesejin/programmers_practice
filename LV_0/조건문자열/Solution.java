package LV_0.조건문자열;

public class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if (ineq.equals("<")){
            if (eq.equals("=")){
                if (n <= m) answer = 1;
            } else {
                if (n < m) answer = 1;
            }
        } else {
            if (eq.equals("=")){
                if (n >= m) answer = 1;
            } else {
                if (n > m) answer = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String ineq1 = "<";
        String eq1 = "=";
        int n1 = 20;
        int m1 = 50;
        String ineq2 = ">";
        String eq2 = "!";
        int n2 = 41;
        int m2 = 78;
        System.out.println(T.solution(ineq1,eq1,n1,m1));
    }
}
