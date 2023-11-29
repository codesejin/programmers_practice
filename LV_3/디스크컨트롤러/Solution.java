package LV_3.디스크컨트롤러;

import java.util.*;

class Solution {
    class Job {
        int start;
        int cost;

        public Job(int start, int cost) {
            this.start = start;
            this.cost = cost;
        }
    }
    public int solution(int[][] jobs) {
        PriorityQueue<Job> wait = new PriorityQueue<>((o1, o2) -> o1.start - o2.start);
        PriorityQueue<Job> ready = new PriorityQueue<>((o1, o2) -> o1.cost - o2.cost);
        int waitTime = 0, costTime = 0; // 대기 시간, 총 처리시간
        int idle = 0, count = 0; // 유휴시간, 처리된 작업 수

        for (int i = 0; i < jobs.length; i++) {
            wait.add(new Job(jobs[i][0], jobs[i][1]));
        }

        while (count < jobs.length) {
            while (!wait.isEmpty() && wait.peek().start <= costTime) {
                ready.offer(wait.poll());
            }

            if (ready.isEmpty()) { // 대기중인 작업 중 가장 빨리 요청오는 작업의 요청시점까지 유휴시간
                idle += wait.peek().start - costTime;
                costTime = wait.peek().start;
            }
            else { // ready에 들어간거 실행
                Job job = ready.poll();
                waitTime += costTime - job.start; // 이전프로세스가 종료되는 시점부터 현재 프로세스가 요청한 시점의 차이
                costTime += job.cost; // 소요시간 합친거
                count++;
            }
        }

        return (waitTime + costTime - idle) / jobs.length;
    }
}
