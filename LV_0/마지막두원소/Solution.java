package LV_0.마지막두원소;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list) {
        int size = num_list.length;
        int[] answer = Arrays.copyOf(num_list,size+1);
        if(num_list[size-1] > num_list[size-2]) {
            answer[size] = num_list[size-1] - num_list[size-2];
        } else {
            answer[size] = num_list[size-1] * 2;
        }
        return answer;
    }
}
