package LV_0.문자열정렬하기2;

import java.util.Arrays;

public class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        char[] arr = my_string.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
