package LV_0.등수매기기;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            int eng = score[i][0];
            int math = score[i][1];
            float avg = (eng + math) / 2f;

            int rank = 1; // 1등 초기화
            // 다른 학생이랑 비교
            for (int j = 0; j < score.length; j++) {
                if (i != j) {
                    int otherEng = score[j][0];
                    int otherMath = score[j][1];
                    float otherAvg = (otherEng + otherMath) / 2f;
                    if (avg < otherAvg) {
                        rank++;
                    }
                }
            }

            answer[i] = rank;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[][] score1 = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        int[][] score2 = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        System.out.println(Arrays.toString(T.solution(score2)));
    }
}
