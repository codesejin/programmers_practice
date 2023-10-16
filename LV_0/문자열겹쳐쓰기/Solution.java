package LV_0.문자열겹쳐쓰기;

public class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
//        StringBuilder sb = new StringBuilder();
//        int idx = 0;
//        for (int i = 0; i < my_string.length(); i++) {
//            if (i >= s && i < overwrite_string.length() + s) sb.append(overwrite_string.charAt(idx++));
//            else sb.append(my_string.charAt(i));
//        }
//        return sb.toString();
        String before = my_string.substring(0, s);
        String after = my_string.substring(s + overwrite_string.length());
        return before + overwrite_string + after;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String my_string = "Program29b8UYP";
        String overwrite_string = "merS123";
        int s = 7;
        System.out.println(T.solution(my_string, overwrite_string, s));
    }
}
