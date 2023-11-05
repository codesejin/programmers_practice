package LV_0.배열만들기3;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int last = intervals[i][1];
            for (int j = start; j <= last ; j++) {
                list.add(arr[j]);
            }
        }
        return list.stream().mapToInt( i -> i).toArray();
    }
}
