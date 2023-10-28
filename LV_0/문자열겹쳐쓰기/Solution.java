package LV_0.문자열겹쳐쓰기;

public class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        // 첫번째 풀이
//        StringBuilder sb = new StringBuilder();
//        int idx = 0;
//        for (int i = 0; i < my_string.length(); i++) {
//            if (i >= s && i < overwrite_string.length() + s) sb.append(overwrite_string.charAt(idx++));
//            else sb.append(my_string.charAt(i));
//        }
//        return sb.toString();
        // 다른 사람 풀이
//        String before = my_string.substring(0, s);
//        String after = my_string.substring(s + overwrite_string.length());
//        return before + overwrite_string + after;
        // 두번째 풀이
        StringBuilder sb = new StringBuilder();
        sb.append(my_string.substring(0, s))
                .append(overwrite_string)
                .append(my_string.substring(s+overwrite_string.length()));
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String my_string = "Program29b8UYP";
        String overwrite_string = "merS123";
        int s = 7;
        System.out.println(T.solution(my_string, overwrite_string, s));
    }
}
