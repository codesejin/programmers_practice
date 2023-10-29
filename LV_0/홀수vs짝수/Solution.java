package LV_0.홀수vs짝수;

public class Solution {
    public int solution(int[] num_list) {
        int even = 0, odd = 0;
        for (int x = 0; x < num_list.length; x++) {
            if (x % 2 == 0) even += num_list[x];
            else odd += num_list[x];
        }
        return Math.max(even,odd);
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] num_list = {4,2,6,1,7,6};
        System.out.println(T.solution(num_list));
    }
}
