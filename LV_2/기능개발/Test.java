package LV_2.기능개발;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) { // 우선순위대로
            int remainAmount = 100 - progresses[i];
            int finishDate = (remainAmount / speeds[i]) + (remainAmount % speeds[i] != 0 ? 1 : 0);
            queue.offer(finishDate);
        }
        int cnt = 1;
        int target = queue.poll();
        while (!queue.isEmpty()) {
            if (target >= queue.peek()) {
                cnt ++;
                queue.poll();
            } else {
                result.add(cnt);
                cnt = 1;
                target = queue.poll();
            }
        }
        result.add(cnt);
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Test T = new Test();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(T.solution(progresses, speeds));
    }
}
