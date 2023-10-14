package LV_0.세균증식;

public class Solution {

    public int solution(int n, int t) {
        for (int time = 0; time < t; time++) {
            n *= 2;
        }
        return n;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        int n = 2;
        int t = 10;
        System.out.println(T.solution(n,t));

    }
}
