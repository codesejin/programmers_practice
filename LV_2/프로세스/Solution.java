package LV_2.프로세스;

import java.util.LinkedList;
import java.util.Queue;

class Cpu {
    int id;
    int priority;

    public Cpu(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Cpu> q = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            q.offer(new Cpu(i, priorities[i]));
        }

        while (!q.isEmpty()) {
            Cpu cur = q.poll();
            for (Cpu tmp : q) {
                if (tmp.priority > cur.priority) {
                    q.offer(cur);
                    cur = null;
                    break;
                }
            }
            if (cur != null) {
                answer++;
                if (cur.id == location) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] priorities1 = {2, 1, 3, 2};
        int location1 = 2; // 찾고자하는 것
        System.out.println(T.solution(priorities1, location1));

    }
}
