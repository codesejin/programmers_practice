package LV_1.숫자3진법자르기;

public class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder(Integer.toString(n, 3)).reverse();
        return Integer.parseInt(sb.toString(),3);
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        int n = 45;
        System.out.println(T.solution(n));

    }
}
