package LV_0.뒤에서5등위로;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        Arrays.sort(num_list);
        int idx = 0;
        for (int i = 5; i < num_list.length ; i++) {
            answer[idx++] = num_list[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        System.out.println(Arrays.toString(T.solution(num_list)));
    }
}
