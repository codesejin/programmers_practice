package LV_0.문자열뒤집기;

public class Solution {
    public String solution(String my_string, int s, int e) {
        char[] charArray = my_string.toCharArray();
        int rt = e;
        int len = s+((e-s)/2);
        for (int lt = s; lt <= len; lt++) {
            char tmp = charArray[lt];
            charArray[lt] = charArray[rt];
            charArray[rt] = tmp;
            rt--;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String my_string1 ="Progra21Sremm3";
        int s1 = 6;
        int e1 = 12;
        String my_string2 ="Stanley1yelnatS";
        int s2 = 4;
        int e2 = 10;
        String my_string3 ="49gh43jOIQvkSH";
        int s3 = 5;
        int e3 = 5;
        System.out.println(T.solution(my_string3,s3,e3));
    }
}
