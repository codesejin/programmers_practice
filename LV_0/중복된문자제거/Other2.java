package LV_0.중복된문자제거;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Other2 {
    public String solution(String my_string) {
        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<>(Arrays.asList(answer));

        return String.join("", set);
    }
}
