package LV_2.프로세스;

import java.util.LinkedList;
import java.util.Queue;

class Cpu {
    int location;
    int priority;

    public Cpu(int location, int priority) {
        this.location = location;
        this.priority = priority;
    }
}

public class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Cpu> readyQ = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            readyQ.offer(new Cpu(i, priorities[i]));
        }

        while (!readyQ.isEmpty()) {
            Cpu current = readyQ.poll();
            // 우선순위대로 실행하기 위한 정렬
            for (Cpu remain : readyQ) {
                if (remain.priority > current.priority) {
                    readyQ.offer(current);
                    current = null;
                    break;
                }
            }
            if (current != null) {
                answer++; // 우선순위대로 실행하는 횟수
                if (current.location == location) return answer;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] priorities1 = {2, 1, 3, 2}; // 현재 실행 대기 큐에 있는 프로세스 중요도 순서대로
        int location1 = 2; // 몇 번째로 실행되는지 알고 싶은 프로세스 위치
        int[] priorities2 = {1, 1, 9, 1, 1, 1}; // 현재 실행 대기 큐에 있는 프로세스 중요도 순서대로
        int location2 = 0; // 몇 번째로 실행되는지 알고 싶은 프로세스 위치
        System.out.println(T.solution(priorities2, location2)); // location이 몇 번째로 실행되는지

    }
}