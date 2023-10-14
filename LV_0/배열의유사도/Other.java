package LV_0.배열의유사도;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Other {
    public int solution(String[] s1, String[] s2) {
        Set<String> set = new HashSet<>(Arrays.asList(s1));
        return (int)Arrays.stream(s2).filter(set::contains).count();
    }
}
