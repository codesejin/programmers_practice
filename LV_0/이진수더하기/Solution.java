package LV_0.이진수더하기;

public class Solution {
    public String solution(String bin1, String bin2) {
        int addedNum = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        return Integer.toBinaryString(addedNum);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String bin1 = "10";
        String bin2 = "11";
        String bin11 = "1001";
        String bin22 = "1111";
        System.out.println((s.solution(bin11, bin22)));
    }
}
