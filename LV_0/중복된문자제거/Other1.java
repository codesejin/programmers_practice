package LV_0.중복된문자제거;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Other1 {
    public String solution(String myString) {
        return Arrays.stream(myString.split("")).distinct().collect(Collectors.joining());
    }
}
