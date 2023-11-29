package LV_3.이중우선순위큐;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < operations.length; i++) {
            String[] split = operations[i].split(" ");
            String first = split[0];
            String second = split[1];
            if (first.equals("I")) {
                minheap.offer(Integer.parseInt(second));
            }
            else {
                if (!minheap.isEmpty()) {
                    if (second.equals("-1")) { // 최솟값
                        minheap.poll();
                    } else if (second.equals("1")) { // 최댓값
                        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
                        max.addAll(minheap);
                        max.poll();
                        minheap.clear();
                        minheap.addAll(max);
                    }
                }
            }
        }
        maxheap.addAll(minheap);
        answer[0] = !maxheap.isEmpty() ? maxheap.poll() : 0;
        answer[1] = !minheap.isEmpty() ? minheap.poll() : 0;
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String[] operation1 = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        String[] operation2 = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        System.out.println(Arrays.toString(T.solution(operation2)));
    }
}
