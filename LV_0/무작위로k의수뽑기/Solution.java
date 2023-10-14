package LV_0.무작위로k의수뽑기;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (list.size() >= k) break;
            if (!list.contains(arr[i])) list.add(arr[i]);
        }
        int idx = 0;
        for (int x : list) {
            answer[idx++] = x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] arr = {0, 1, 1, 2, 2, 3};
        int k = 3;
        System.out.println(Arrays.toString(T.solution(arr, k)));
    }
}
