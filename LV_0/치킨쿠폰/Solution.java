package LV_0.치킨쿠폰;

public class Solution {
    public int solution(int chicken) {
        int answer = 0;

        while (chicken >= 10) {
            int service = chicken / 10; // 10번 주문했을때 받을 수 있는 서비스 치킨
            int remainCoupon = chicken % 10; // 남은 쿠폰 수
            chicken = service + remainCoupon; // 서비스받은 치킨의 쿠폰수와 남은 쿠폰 수 더함

            answer += service;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int chicken1 = 100;
        int chicken2 = 1081;
        System.out.println(T.solution(chicken2));
    }
}
