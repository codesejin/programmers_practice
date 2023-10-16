package LV_0.문자열곱하기;

public class Solution {
    public String solution(String my_string, int k) {
        return my_string.repeat(k);
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        String my_string ="string";
        int k = 3;
        System.out.println(T.solution(my_string, k));
    }
}
