package LV_0.대문자와소문자;

public class Solution {

    public String solution(String my_string) {
        char[] arr = my_string.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 'A' && arr[i] <= 'Z') arr[i] = Character.toLowerCase(arr[i]);
            else arr[i] = Character.toUpperCase(arr[i]);
        }
        return new String(arr);
    }
}
