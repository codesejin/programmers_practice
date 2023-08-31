package LV_0.특정문자열로끝나는가장긴부분문자열찾기;

public class Solution {
    public String solution(String myString, String pat) {
        char lastChar = pat.charAt(pat.length() - 1);
        int lastIndex = myString.lastIndexOf(lastChar);
        return myString.substring(0,lastIndex+1);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String myString = "AbCdEFG";
        String pat = "dE";
        System.out.println(s.solution(myString, pat));
    }
}
