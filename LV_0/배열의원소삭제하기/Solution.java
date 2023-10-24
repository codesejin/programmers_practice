package LV_0.배열의원소삭제하기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        for (int num : delete_list) {
            list.remove((Integer) num);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
