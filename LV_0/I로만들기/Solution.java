package LV_0.I로만들기;

public class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        char[] array = myString.toCharArray();
        for (Character x : array) {
            if (x-'0' <= 'l'-'0') sb.append('l');
            else sb.append(x);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String myString = "abcdevwxyz";
        System.out.println(T.solution(myString));
    }
}
