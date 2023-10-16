package LV_0.문자열의앞의n글자;

public class Solution {

    public String solution(String my_string, int n) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            sb.append(my_string.charAt(i));
//        }
//        return sb.toString();
        return my_string.substring(0, n);
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        String my_string = "ProgrammerS123";
        int n = 11;
        System.out.println(T.solution(my_string, n));
    }
}
