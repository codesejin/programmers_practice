package LV_0.할일목록;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) list.add(todo_list[i]);
        }
        return list.stream().toArray(String[]::new);
    }
}
