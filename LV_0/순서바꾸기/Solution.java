package LV_0.순서바꾸기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        List<Integer> start = new ArrayList<>();
        List<Integer> last = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            start.add(num_list[i]);
        }
        for(int i = n; i < num_list.length; i++) {
            last.add(num_list[i]);
        }
        int idx = 0;
        for(int i = 0; i < num_list.length; i++) {
            if(i < n-1)  answer[i] = last.get(i);
            else answer[i] = start.get(idx++);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] num_list1 = {2,1,6};
        int n1 = 1;
        int[] num_list2 = {5, 2, 1, 7, 5};
        int n2 = 3;
        System.out.println(Arrays.toString(T.solution(num_list1,n1)));
    }
}
