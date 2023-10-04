package LV_2.기능개발;

import java.util.*;

public class Solution {

    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int remainProcess = 100 - progresses[i];
            int tmp = speeds[i];
            int completeDate = (remainProcess % tmp == 0) ? remainProcess/tmp : (remainProcess/tmp) + 1;
            Q.offer(completeDate);
        }

        int cnt = 1;
        Integer a = Q.poll();
        List<Integer> list = new ArrayList<>();
        while(!Q.isEmpty()) {
            if (a >= Q.peek()) {
                cnt++;
                Q.poll();
            } else {
                list.add(cnt);
                cnt = 1;
                a = Q.poll();
            }
        }
        list.add(cnt);

        return  list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        int[] progresses1 = {93, 30, 55}; // 먼저 배포되어야 하는 순서대로 작업 진도가 적힘
        int[] speeds1 = 	{1, 30, 5};// 작업의 개발 속도가 적힌 정수 배열
        int[] progresses2 = {95, 90, 99, 99, 80, 99}; // 먼저 배포되어야 하는 순서대로 작업 진도가 적힘
        int[] speeds2 = 	{1, 1, 1, 1, 1, 1};// 작업의 개발 속도가 적힌 정수 배열
        System.out.println(Arrays.toString(T.solution(progresses1, speeds1)));
    }
}
