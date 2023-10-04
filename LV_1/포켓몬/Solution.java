package LV_1.포켓몬;

import java.util.HashMap;

// 해쉬맵
public class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i ++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int max = nums.length/2;
        if (max >= map.size()) answer = map.size();
        else answer = max;
        return  answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        int[] nums = {3,1,2,3};
        System.out.println(T.solution(nums));
    }
}
