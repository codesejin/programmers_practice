package LV_1.시저암호;

public class Solution1 {
    public String solution(String s, int n) {
        String result = "";
        n = n % 26;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println("ch = " + ch);
            if (Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
                System.out.println(ch - 'A');
                System.out.println(2 + 'A');
                System.out.println(ch + 'A');
                System.out.println((ch + 'A') % 26);
            }
            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        String s1 = "AB";
        int n1 = 1;

        String s2 = "z";
        int n2 = 1;

        String s3 = "a B z";
        int n3 = 4;

        System.out.println(solution1.solution(s1, n1));
    }
}
