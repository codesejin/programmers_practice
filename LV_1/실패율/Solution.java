package LV_1.실패율;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int N = 5; // 전체 스테이지의 개수
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        // 현재 멈춰있는 스테이지의 번확 담긴 배열
        System.out.println(new Solution().solution(N, stages));
    }
    // 실패율이 높은 스테이지부터 내림차순으로 스테이지 번호가 담긴 배열을 리턴
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        // 각 스테이지에 도전한 사람 수
        int[] completeStage = new int[N+1];
        // 각 스테이지를 클리어하지 못한 사람 수
        int[] notCompleteStage = new int[N+1];
        for(int i=0; i<stages.length; i++) {
            for(int j=0; j< stages[i]; j++) {
                completeStage[j]++;
            }
            notCompleteStage[stages[i] - 1] ++;
        }
        System.out.println("complete Stage :" + Arrays.toString(completeStage));
        System.out.println("notcomplete Stage :" + Arrays.toString(notCompleteStage));

        double[] failRate = new double[N];
        for(int i=0; i< N; i++) {
            if(completeStage[i] == 0) {
                failRate[i] = 0;
            } else {
                failRate[i] = (double) notCompleteStage[i] / completeStage[i];
            }
        }
        System.out.println("failRate :" + Arrays.toString(failRate));
        for(int i=0; i<N; i++) {
            double max = -1; // 실패율
            int maxIdx = 0;// 실패율이 가장 높은 스테이지 번호
            for(int j=0; j<N; j++) { // 실패율이 가장 높은 스테이지 번호 찾기
                if(failRate[j] > max) { // 실패율이 가장 높은 스테이지 번호 찾기
                    max = failRate[j]; // 실패율 갱신
                    maxIdx = j; // 실패율이 가장 높은 스테이지 번호 갱신
                }
            }
            answer[i] = maxIdx + 1;
            failRate[maxIdx] = -1;
        }

        return answer;
    }
}
