package LV_1.같은숫자는싫어;

import java.util.*;

public class Solution1 {

    // queue 풀이
    public int[] solution(int[] arr) {

        // 정확성 71.9, 효율성 : 28.1
        Queue<Integer> q = new LinkedList<>();

        final int LENGTH = arr.length;
        for (int i = 0; i < LENGTH; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                q.offer(arr[i]);
            }
        }

        int[] answer = new int[q.size()];
        int idx = 0;
        while (!q.isEmpty()) {
            answer[idx++] = q.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        solution1.solution(arr);
    }
}
