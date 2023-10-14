package LV_0.삼각형의완성조건1;

public class Solution {
    public int solution(int[] sides) {
        int answer = 2;
        if (sides[0] + sides[1] > sides[2] &&
                sides[1] + sides[2] > sides[0] &&
                sides[2] + sides[0] > sides[1]
        ) answer = 1;
            return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] sides1 = {1, 2, 3};
        int[] sides3 = {199, 72, 222};
        System.out.println(T.solution(sides1));

    }
}
