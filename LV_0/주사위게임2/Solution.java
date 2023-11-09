package LV_0.주사위게임2;

public class Solution {
    public int solution(int a, int b, int c) {
        double answer = 0;
        if (a  == b && a == c)
            answer = (a + b + c) *
                    (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2)) *
                            (Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3));
        else if (a != b && b != c && a != c) {
            answer = (a + b + c);
        } else {
            answer = (a + b + c) *
                    (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2));
        }
        return (int)answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int a = 2;
        int b = 6;
        int c = 1;
        System.out.println(T.solution(a,b,c));
    }
}
