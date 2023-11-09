package LV_0.세로읽기;

public class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        for (int i = 0; i < my_string.length() ; i+=m) {
            String substring = my_string.substring(i,i+m);
            answer += substring.charAt(c-1);
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        String my_string = "ihrhbakrfpndopljhygc";
        int m = 4;
        int c = 2;
        System.out.println(T.solution(my_string, m , c));
    }
}
