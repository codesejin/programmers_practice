package LV_0.A강조하기;

public class Solution {
    public String solution(String myString) {
        myString = myString.toLowerCase();
        char[] array = myString.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a') array[i] = Character.toUpperCase(array[i]);
        }
        return new String(array);
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String myString1 = "abstract algebra";
        String myString2 = "PrOgRaMmErS";
        System.out.println(T.solution(myString1));
    }
}
