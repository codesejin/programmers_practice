package LV_0.가장큰수찾기;

public class Solution {
    public int[] solution(int[] array) {
        int max = Integer.MIN_VALUE, idx = 0;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(array[i], max);
            if (array[i] == max) idx = i;
        }
        return new int[]{max, idx};
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        int[] array = {1, 8, 3};
        System.out.println(T.solution(array));
    }
}
