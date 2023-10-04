package LV_1.모의고사;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1,2,3,4,5}; // 5개씩 반복
        int[] second = {2,1,2,3,2,4,2,5}; // 8개씩 반복
        int[] third = {3,3,1,1,2,2,4,4,5,5}; // 10개씩 반복
        int answer1=0, answer2 =0, answer3 =0;

        // 수포자들의 점수 계산
        for(int i=0; i<answers.length; i++) {
            if(answers[i] == first[i%5]) answer1++;
            if(answers[i] == second[i%8]) answer2++;
            if(answers[i] == third[i%10]) answer3++;

        }

        // 최대 점수 구하기
        int max = Math.max(answer1, Math.max(answer2, answer3));

        // 최대 점수를 가진 수포자 리스트 생성
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max==answer1) list.add(1); //max값이랑 같으면 넣는다.
        if(max==answer2) list.add(2);
        if(max==answer3) list.add(3);


        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        int[] answers1 = {1,2,3,4,5};
        int[] answers2 = {1,3,2,4,2};
        System.out.println(Arrays.toString(T.solution(answers2)));

    }
}
