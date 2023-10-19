package LV_0.공배수;

public class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        if (number % n == 0 && number % m == 0) return 1;
        return answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        int number = 60;
        int n = 2;
        int m = 3;
        System.out.println(T.solution(number,n,m));
    }
}
