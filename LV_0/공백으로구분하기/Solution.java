package LV_0.공백으로구분하기;

import java.util.Arrays;

public class Solution {
    public String[] solution(String my_string) {
        String[] split = my_string.trim().split("\\s+");
        return split;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        String my_string = " i    love  you";
        System.out.println(Arrays.toString(T.solution(my_string)));
    }
}
