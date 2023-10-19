package LV_0.n보다커질때까지더하기;

public class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int x : numbers) {
            if (answer > n) return  answer;
            answer += x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] numbers = {34, 5, 71, 29, 100, 34};
        int n = 123;
        System.out.println(T.solution(numbers, n));
    }
}
