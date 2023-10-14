package LV_0.삼각형의완성조건2;

public class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int big = Math.max(sides[0], sides[1]);
        int small = Math.min(sides[0], sides[1]);

        for (int i = big-small+1; i <= big+small-1; i++) {
            answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        int[] sides1 = {1, 2};
        int[] sides2 = {3, 6}; // 4~8
        int[] sides3 = {11, 7}; // 5~17
        System.out.println(T.solution(sides3));
    }
}
