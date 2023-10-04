package LV_2.다리를지나는트럭;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        int sum = 0; // 다리 건너는 중인 트럭 무게 총합
        int time = 0; //큐에 오를때만 ++;

        for (int i = 0; i < truck_weights.length; i++) {
            int truck = truck_weights[i];
            while(true) {
                // 큐에 아무것도 없는 경우 - 어떠한 트럭도 다리 위에 없음
                if (queue.isEmpty()) {
                    queue.offer(truck);
                    sum+= truck;
                    time++; // 다리에 오를 때만 시간 추가
                    break;
                } else if (queue.size() == bridge_length) { //큐의 다리길이 만큼 트럭이 찬 경우
                    sum -= queue.poll();
                } else {//  다리길이 만큼 큐가 차지 않았음
                    // weight 값을 넘지 않는 선에서 새로운 트럭을 다리에 올려줌
                    if (sum + truck <= weight) {
                        queue.offer(truck);
                        sum+= truck;
                        time++;
                        break;
                    } else {
                        // 넘는다면 0을 넣어 이미 큐에 있는 트럭이 다리를 건너게 만듬
                        queue.offer(0);
                        time++;
                    }
                }
            }
        }
        System.out.println(queue);
        // 마지막 트럭에서 반복문이 끝나는데, 마지막 역시 다리 길이만큼 지나가야하기에 + 다리 길이
        //걸린 시간 + 마지막 트럭의 통과시간(다리의 길이)
        return time + bridge_length;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int bridge_length1 = 2; // 다리에 트럭이 최대 올라갈 수 있는 수
        int weight1 = 10; // 다리가 견딜 수 있는 무게
        int[] truck_weights1 = {7,4,5,6}; // 트럭 한개당 무게
        int bridge_length2 = 100;
        int weight2 = 100;
        int[] truck_weights2 = {10};
        System.out.println(T.solution(bridge_length1, weight1, truck_weights1));
    }
}
