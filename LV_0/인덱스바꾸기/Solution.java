package LV_0.인덱스바꾸기;

public class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] charArray = my_string.toCharArray();
        char tmp = charArray[num1];
        charArray[num1] = charArray[num2];
        charArray[num2] = tmp;
        return new String(charArray);
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        String my_string = "I love you";
        int num1 = 3;
        int num2 = 6;
        System.out.println(T.solution(my_string, num1, num2));
    }
}
