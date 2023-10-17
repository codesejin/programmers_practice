package LV_2.JadenCase문자열만들기;


public class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toLowerCase().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i == 0 && Character.isAlphabetic(charArray[i])) charArray[i] = Character.toUpperCase(charArray[i]);
            else if(charArray[i] == ' ' && i == charArray.length-1) break;
            else if (charArray[i] == ' ' && Character.isAlphabetic(charArray[i+1])) charArray[i + 1] = Character.toUpperCase(charArray[i + 1]);
        }

        for (char x : charArray) {
            sb.append(x);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String s1 = "3people unFollowed me";
        String s2 = "for the last week";
        String s3 = "hello      world  ";
        System.out.println(T.solution(s3));
    }
}
