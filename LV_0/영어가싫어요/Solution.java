package LV_0.영어가싫어요;

import java.util.HashMap;
import java.util.Map;

public class Solution {


    public long solution(String numbers) {
        // 0 ~ 9
        long answer = 0;
        Map<String, Long> map = new HashMap<>();
        map.put("zero",0L);
        map.put("one",1L);
        map.put("two",2L);
        map.put("three",3L);
        map.put("four",4L);
        map.put("five",5L);
        map.put("six",6L);
        map.put("seven",7L);
        map.put("eight",8L);
        map.put("nine",9L);
        int idx = 1;
        while(!numbers.isEmpty()) {
            String substring = numbers.substring(0, idx);
            if (map.containsKey(substring)) {
                Long num = map.get(substring);
                answer = (answer * 10) + num;
                numbers = numbers.substring(idx);
                idx = 1;
            }
            idx++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String numbers1 = "onetwothreefourfivesixseveneightnine";
        String numbers2 = "onefourzerosixseven";
        System.out.println(T.solution(numbers1));
    }
}
