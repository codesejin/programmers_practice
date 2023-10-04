package LV_1.부족한금액계산하기;

public class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }
        return (money < sum) ? sum - money : 0L;

    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int price = 3;
        int money = 20;
        int count = 4;
        System.out.println(T.solution(price, money, count));
    }
}
