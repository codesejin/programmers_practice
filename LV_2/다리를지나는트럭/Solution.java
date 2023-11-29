package LV_2.다리를지나는트럭;

import java.util.LinkedList;
import java.util.Queue;
public class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int seconds = 0, totalWeight = 0;
        Queue<Integer> onBridge = new LinkedList<>();
        for (int i = 0; i < truck_weights.length; i++) {
            int targetTruck = truck_weights[i];
            if (onBridge.isEmpty()) {
                onBridge.offer(targetTruck);
                seconds++;
                totalWeight += targetTruck;
                // 다리에 트럭이 1개라도 있을 때
            } else {
                while (true) {
                    // 다리에 트럭이 2개일때
                    if (onBridge.size() == bridge_length) {
                        totalWeight -= onBridge.poll();
                        System.out.println("다리에 올라간 트럭(진행중 - 내리기) : "+ onBridge);
                        // 다리에 트럭이 1개일때
                    } else {
                        if (totalWeight + targetTruck <= weight) {
                            onBridge.offer(targetTruck);
                            System.out.println("다리에 올라간 트럭(진행중 - 올리기) : "+ onBridge);
                            seconds++;
                            totalWeight += targetTruck;
                            break;
                        } else {
                            onBridge.offer(0);
                            System.out.println("다리에 올라간 트럭(진행중 - 0) : "+ onBridge);
                            seconds++;
                        }
                    }
                }
            }
            System.out.println("다리에 올라간 트럭 : "+ onBridge);
        }
        // 마지막 트럭에서 반복문이 끝나는데, 마지막 역시 다리 길이만큼 지나가야하기에 + 다리 길이
        // 걸린 시간 + 마지막 트럭의 통과시간(다리의 길이)
        return seconds + bridge_length;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int bridge_length1 = 2; // 다리에 트럭이 최대 올라갈 수 있는 수
        int weight1 = 10; // 다리가 견딜 수 있는 무게
        int[] truck_weights1 = {7, 4, 5, 6}; // 트럭 한개당 무게
        int bridge_length2 = 100;
        int weight2 = 100;
        int[] truck_weights2 = {10};
        int bridge_length3 = 100;
        int weight3 = 100;
        int[] truck_weights3 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int bridge_length4 = 3; // 다리에 트럭이 최대 올라갈 수 있는 수
        int weight4 = 3; // 다리가 견딜 수 있는 무게
        int[] truck_weights4 = {2, 2, 2}; // 트럭 한개당 무게
        System.out.println(T.solution(bridge_length1, weight1, truck_weights1));
    }
}
