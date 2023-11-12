package LV_0.전국대회선발고사;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> map = new TreeMap<>(); // 등수, 인덱스
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                map.put(rank[i], i);
            }
        }
        int cnt = 0;
        for (int x : map.values()) {
            if (cnt < 3) {
                answer = answer * 100 + x;
                cnt++;
            } else break;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};
        System.out.println(T.solution(rank, attendance));
    }
}
