package LV_0.특정한문자를대문자로바꾸기;

public class Solution {

    public String solution(String my_string, String alp) {
        return my_string.replace(alp,alp.toUpperCase());
    }
    public static void main(String[] args) {

        Solution T = new Solution();
        String my_string="programmers";
                String alp ="p";
        System.out.println(T.solution(my_string, alp));

    }
}
