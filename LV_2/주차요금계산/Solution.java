package LV_2.주차요금계산;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        System.out.println(new Solution().solution(fees, records));
    }
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        Map<String, Car> map = new HashMap<>();
        for (int i = 0; i < records.length; i++) {
            String[] split = records[i].split(" ");
            String time = split[0];
            String carNum = split[1];
            String inout = split[2];
            if (!map.containsKey(carNum)) {
                map.put(carNum, new Car(carNum, time,0, inout));
            } else {
                Car car = map.get(carNum);
                if (!car.status.equals("OUT")) { // 저장된게 IN 일 경우
                    car.accumulateTime += (convertTime(car.inTime, time));
                    car.status = inout;
                } else { // 저장된게 OUT 일 경우
                    car.inTime = time;
                    car.status = inout;
                }
            }
        }
        for (String key : map.keySet()) {
            Car car = map.get(key);
            if (!car.status.equals("OUT")) {
                car.accumulateTime += (convertTime(car.inTime, "23:59"));
            }
        }

        List<String> keySetList = new ArrayList<>(map.keySet());
        Collections.sort(keySetList);

        answer = new int[map.size()];
        for (int i = 0; i < answer.length; i++) {
            Car car = map.get(keySetList.get(i));
            int time = car.accumulateTime;
            if (time <= fees[0]) {
                answer[i] = fees[1];
            } else {
                answer[i] = fees[1] + (int) Math.ceil((time - fees[0]) / (double) fees[2]) * fees[3];
            }
        }

        return answer;
    }

    private int convertTime(String inTime, String outTime) {
        String[] inSplit = inTime.split(":");
        String[] outSplit = outTime.split(":");
        int inHour = Integer.parseInt(inSplit[0]);
        int inMin = Integer.parseInt(inSplit[1]);
        int outHour = Integer.parseInt(outSplit[0]);
        int outMin = Integer.parseInt(outSplit[1]);
        return (outHour - inHour) * 60 + (outMin - inMin);
    }

    class Car implements Comparable<Car> {
        String carNum;
        String inTime;
        int accumulateTime;
        String status;

        public Car(String carNum, String inTime, int accumulateTime, String status) {
            this.carNum = carNum;
            this.inTime = inTime;
            this.accumulateTime = accumulateTime;
            this.status = status;
        }
        @Override
        public int compareTo(Car o) {
            return this.carNum.compareTo(o.carNum);
        }
    }
}
