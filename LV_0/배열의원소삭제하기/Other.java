package LV_0.배열의원소삭제하기;

import java.util.ArrayList;
import java.util.List;

public class Other {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        List<Integer> deleteList = new ArrayList<>();
        for (int num : delete_list) {
            deleteList.add(num);
        }

        list.removeIf(deleteList::contains);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
