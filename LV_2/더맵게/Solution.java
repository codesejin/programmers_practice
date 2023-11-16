package LV_2.더맵게;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {

    public int solution(int[] scoville, int K) {
        int answer = 0;

        // 우선순위 큐를 사용하여 최소 힙 구현
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int s : scoville) {
            pq.offer(s);
        }

        while (pq.size() > 1 && pq.peek() < K) {
            int most = pq.poll();
            int more = pq.poll();
            int mixed = most + (more * 2);
            pq.offer(mixed);
            answer++;
        }

        // 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우
        if (pq.peek() < K) {
            return -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        System.out.println(T.solution(scoville,K));
    }
}

// 틀린 풀이
// (1) 시간 초과 : 반복분 조건포함해서 N² + 정렬 NlogN으로 -> N²logN이 되버림
// (2) 제한 사항 누락 : 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1 반환하는 부분이 없음
//    public int solution(int[] scoville, int K) {
//        int answer = 0;
//
//        while (checkUnderK(scoville, K)) {
//            Arrays.sort(scoville);
//            int Most = scoville[0];
//            int More = scoville[1];
//            int mixed = Most + (More * 2);
//            scoville[1] = mixed;
//            scoville = Arrays.copyOfRange(scoville,1,scoville.length);
//            System.out.println(Arrays.toString(scoville));
//            answer++;
//        }
//
//        return answer;
//    }
//    public boolean checkUnderK(int[] scoville, int K) {
//        for (int i = 0; i < scoville.length; i++) {
//            if (scoville[i] < K) return true;
//        }
//        return false;
//    }