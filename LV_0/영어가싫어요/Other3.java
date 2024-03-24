package LV_0.영어가싫어요;

import java.util.Map;

public class Other3 {
    private static final Map<String, Integer> CONTAINS =
            Map.of("zero", 0, "one", 1, "two", 2,"three", 3, "four", 4, "five", 5, "six", 6, "seven", 7, "eight", 8, "nine", 9);
    public long solution(String numbers) {
        StringBuilder answer = new StringBuilder();
        StringBuilder builder = new StringBuilder();
        for (String s : numbers.split("")) {
            builder.append(s);
            if (CONTAINS.containsKey(builder.toString())) {
                answer.append(CONTAINS.get(builder.toString()));
                builder = new StringBuilder();
            }
        }
        return Long.parseLong(answer.toString());
    }
}
