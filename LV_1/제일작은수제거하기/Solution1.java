package LV_1.제일작은수제거하기;

import java.util.*;

public class Solution1 {
    public int[] solution(int[] arr) {

        int[] answer = {};

        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                list.add(arr[i]);
            }
        }

        int idx = 0;
        if (list.size() > 1) {
            answer = new int[list.size()];
            for (int i = list.size() - 1; i >= 0; i--) {
                answer[idx++] = list.get(i);
            }
        } else {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] arr = {4,3,2,1};
        solution1.solution(arr);
    }
}
