package LV_0.숫자1로만들기;

public class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            int tmp = num_list[i];
            while (tmp > 1) {
                if (tmp % 2 == 0) {
                    tmp = tmp / 2;
                    answer++;
                } else {
                    tmp = (tmp - 1) / 2;
                    answer++;

                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num_list = {12, 4, 15, 1, 14};
        s.solution(num_list);
    }
}
