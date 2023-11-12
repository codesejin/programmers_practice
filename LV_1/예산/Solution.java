package LV_1.예산;

import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0, total = 0;
        Arrays.sort(d);
        for (int x : d ) {
            if (total >= budget) break;
            total += x;
            answer ++;
        }
        return (total > budget) ? answer-1:answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] d = {1, 3, 2, 5, 4}; // 부서별 신청한금액이 들어있는 배열
        int budget = 9; // 예산
        System.out.println(T.solution(d, budget));
    }
}
