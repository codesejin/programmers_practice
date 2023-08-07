package LV_1.정수제곱근판별;

public class Solution1 {
    public long solution(long n) {
        long answer = 0;
        // 제곱근 반환
        double sqrt = Math.sqrt(n);

        if (sqrt == (long)sqrt) {
            answer =  (long) Math.pow((long) sqrt + 1, 2);
        } else {
            answer = -1;
        }
        return answer;
    }


    public static void main(String[] args) {
        long n = 121;
        Solution1 solution1 = new Solution1();
        solution1.solution(n);
    }
}
