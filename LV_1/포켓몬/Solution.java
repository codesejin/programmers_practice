package LV_1.포켓몬;

import java.util.HashMap;
import java.util.Map;

// 해쉬맵
public class Solution {
    public int solution(int[] nums) {
        int maxTake = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x,0)+1);
        }
        if (maxTake >= map.size()) return map.size();
        else return maxTake;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] nums = {3, 1, 2, 3};
        System.out.println(T.solution(nums));
    }
}
