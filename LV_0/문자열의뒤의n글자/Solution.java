package LV_0.문자열의뒤의n글자;

public class Solution {
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length()-n, my_string.length());
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        String my_string = "ProgrammerS123";
        int n = 11;
        System.out.println(T.solution(my_string,n));
    }
}
