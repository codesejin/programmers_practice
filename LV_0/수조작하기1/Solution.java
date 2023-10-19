package LV_0.수조작하기1;

public class Solution {
    public int solution(int n, String control) {
        for (int i = 0; i < control.length(); i++) {
            switch (control.charAt(i)) {
                case 'w': n += 1; break;
                case 's': n -= 1; break;
                case 'd': n += 10; break;
                case 'a': n -= 10; break;
                default:break;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int n = 0;
        String control = "wsdawsdassw";
        System.out.println(T.solution(n, control));
    }
}


