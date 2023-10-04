package LV_0.문자개수세기;

import java.util.Arrays;

public class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (Character x : my_string.toCharArray()) {
            if (x >= 'A' && x <= 'Z') answer[x-'A'] ++;
            else answer[x-'A'-6] ++;
        }
        return answer;

    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String my_string = "Programmers";
        System.out.println(Arrays.toString(T.solution(my_string)));
    }
}
