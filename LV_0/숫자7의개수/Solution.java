package LV_0.숫자7의개수;

import java.util.Arrays;

public class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            int[] digits = Arrays
                    .stream(String.valueOf(array[i])
                    .split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int x: digits) {
                if (x == 7) {
                    answer ++;
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = {7, 77, 17};
        System.out.println(s.solution(array));
    }
}
