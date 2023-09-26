package LV_1.약수의개수와덧셈;

public class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right ; i++) {
            int divisorNum = checkDivisor(i);
            if (divisorNum % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }

    public int checkDivisor(int num ) {
        int divisorNum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisorNum++;
            }
        }
        return divisorNum;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int left = 13;
        int right = 17;
        System.out.println(s.solution(left, right));
    }
}
