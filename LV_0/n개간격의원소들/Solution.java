package LV_0.n개간격의원소들;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list, int n) {
//        int ceil1 = (int) Math.ceil(num_list.length / n);
//        System.out.println(num_list.length / n);
//        System.out.println(ceil1);
//        int ceil2 = (int) Math.ceil(num_list.length / (n * 1.0));
//        System.out.println(num_list.length / (n * 1.0));
//        System.out.println(ceil2);
        int size = num_list.length % n != 0 ? num_list.length/n +1 : num_list.length/n;
        int[] answer = new int[size];
        int idx = 0;
        for (int i = 0; i < num_list.length; i+=n ) {
            answer[idx++] = num_list[i];
        }
        // idx 변수 안 만들고 하는 방법
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = num_list[i * n];
//        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] num_list={4, 2, 6, 1, 7, 6};
        int n=4;
        System.out.println(Arrays.toString(T.solution(num_list, n)));
    }
}
