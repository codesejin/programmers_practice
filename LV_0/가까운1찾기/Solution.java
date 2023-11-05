package LV_0.가까운1찾기;

public class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) return i;
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        int[] arr= {1, 1, 1, 1, 0};
        int idx= 3;
        System.out.println(T.solution(arr,idx));
    }
}
