package LV_0.중복된문자제거;

public class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (sb.toString().contains(String.valueOf(my_string.charAt(i)))) continue;;
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String my_string = "We are the world";
        System.out.println(T.solution(my_string));
    }
}
