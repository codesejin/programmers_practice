package LV_0.문자열로변환;

public class Solution {
    public String solution(int n) {
//        return String.valueOf(n);
        return ""+n;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int n = 123;
        System.out.println(T.solution(n));
    }
}
