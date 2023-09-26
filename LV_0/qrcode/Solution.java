package LV_0.qrcode;

public class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            int remainder = i % q;
            if (remainder == r) {
                char c = code.charAt(i);
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int q = 3;
        int r =  1;
        String code ="qjnwezgrpirldywt";
        System.out.println(s.solution(q, r, code));
    }
}
