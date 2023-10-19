package LV_0.첫번째로나오는음수;

public class Solution {
    public int solution(int[] num_list) {
        int answer = -1;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) return i;
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        int[] num_list = {12, 4, 15, 46, 38, -2, 15};
        System.out.println(T.solution(num_list));
    }
}
