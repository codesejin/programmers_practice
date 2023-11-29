package LV_2.다리를지나는트럭;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    static class Truck {
        int weight; // 트럭의 무게
        int entryTime; // 진입 시간

        Truck(int weight, int entryTime) {
            this.weight = weight;
            this.entryTime = entryTime;
        }
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int seconds = 0;                  // 총 걸린 시간
        int currentWeight = 0;            // 현재 다리 위의 총 무게
        Queue<Truck> onBridge = new LinkedList<>();  // 다리 위의 트럭을 관리하는 큐

        int i = 0;  // 트럭 배열에서 처리 중인 인덱스
        while (i < truck_weights.length || !onBridge.isEmpty()) {
            seconds++;
            System.out.println(seconds);
            if (!onBridge.isEmpty()) {
                System.out.println("다리에 올라간 트럭 무게 : " + onBridge.peek().weight + " 시간 : " + onBridge.peek().entryTime);
            }
            // 다리에 트럭이 올라갈 수 있는 경우 처리
            // 현재 다리의 트럭들 무게와 새로운 트럭의 무게를 더한 값이 다리가 견딜 수 있는 무게보다 작거나 같으면
            // 새로운 트럭은 Truck객체로 생성되서 onBridge 큐에 추가되고, 현재 다리에 있는 총 무게에 추가됨
            if (i < truck_weights.length && currentWeight + truck_weights[i] <= weight) {
                onBridge.offer(new Truck(truck_weights[i], seconds));
                currentWeight += truck_weights[i];
                i++;
            }
            // 다리를 나가는 트럭 처리
            // 큐 맨 앞에 있는 트럭이 다리를 나가는 시간이 다리의 길이와 같아지면 큐에서 제거,
            /// 해당 트럭의 무게를 현재 다리 위의 총 무게에서 빼줌
            if (!onBridge.isEmpty() && seconds - onBridge.peek().entryTime == bridge_length) {
                currentWeight -= onBridge.poll().weight;
            }
        }

        return seconds;
    }


    public static void main(String[] args) {
        Solution2 T = new Solution2();
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
