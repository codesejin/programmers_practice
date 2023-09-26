package LV_0.소인수분해;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 12;
        System.out.println(s.solution(n));
    }
}
