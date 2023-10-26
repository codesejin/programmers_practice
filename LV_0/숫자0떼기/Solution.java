package LV_0.숫자0떼기;

public class Solution {
    public String solution(String n_str) {
        return String.valueOf(Integer.parseInt(n_str));
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String n_str = "0010";
        System.out.println(T.solution(n_str));
    }
}
