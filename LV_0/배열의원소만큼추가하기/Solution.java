package LV_0.배열의원소만큼추가하기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr) {
        int size = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            size += arr[i];
            int cnt = arr[i];
            while (cnt > 0) {
                list.add(arr[i]);
                cnt--;
            }
        }
        int[] answer = new int[size];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
