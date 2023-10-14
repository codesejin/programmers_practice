package LV_0.정수찾기;

public class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for (int x : num_list) {
            if (x == n) answer = 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] num_list = {1, 2, 3, 4, 5};
        int n = 3;
        System.out.println(T.solution(num_list, n));
    }
}
