package LV_1.완주하지못한선수;


import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String x : participant) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (String x : completion) {
            map.put(x, map.get(x) - 1);
            if (map.get(x) == 0) map.remove(x);
        }

        for (String x : map.keySet()) {
            answer = x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};
        String[] participant2 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion2 = {"stanko", "ana", "mislav"};
        System.out.println(T.solution(participant2, completion2));
    }
}
