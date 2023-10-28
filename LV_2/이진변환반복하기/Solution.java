package LV_2.이진변환반복하기;

public class Solution {
    public int[] solution(String s) {
        int binaryCnt = 0, zeroCnt = 0;
        while(!s.equals("1")) {
            int originalLen = s.length();
            s = s.replace("0", "");
            int noZeroLen = s.length();
            zeroCnt += originalLen - noZeroLen;
            s = Integer.toBinaryString(noZeroLen);
            binaryCnt++;
        }
        return new int[]{binaryCnt, zeroCnt};
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String s1 = "110010101001"; // 111111 -> 6자리
        System.out.println(T.solution(s1));
    }
}
