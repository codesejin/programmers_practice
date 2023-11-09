package LV_0.숫자찾기;

public class Solution {
    public int solution(int num, int k) {
        int answer = String.valueOf(num).indexOf(String.valueOf(k));
        return answer >= 0 ? answer + 1 : answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        int num = 10000;
        int k = 0;
        System.out.println(T.solution(num, k));
    }
}
