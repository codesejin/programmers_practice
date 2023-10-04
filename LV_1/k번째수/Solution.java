package LV_1.k번째수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int a = 0; a < commands.length; a++) {
            int i = commands[a][0]; // 2
            int j = commands[a][1]; // 5
            int k = commands[a][2]; // 3
            ArrayList<Integer> list = new ArrayList<>();
            for (int l = i-1; l <= j-1; l++) {
                list.add(array[l]);
            }
            Collections.sort(list);
            int target = list.get(k - 1);
            answer[a] = target;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, // i,j,k
                            {4, 4, 1},
                            {1, 7, 3}};
        System.out.println(Arrays.toString(T.solution(array,commands)));
    }
}
