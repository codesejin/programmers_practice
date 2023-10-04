package LV_0.공던지기;

public class Solution {
    public int solution(int[] numbers, int k) {
        // 첫번째로 던지는 사람은 정해져 있으니 'k번째 횟수' 에서 -1하고,
        // 한명 건너뛰어야 하므로 2 곱하기
        int count = 2 * (k-1);
        int len = numbers.length;
        // 항상 1부터 시작하므로 +1
        return count % len + 1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers1 = {1, 2, 3, 4};
        int k1 = 2;
        int[] numbers2 = {1, 2, 3, 4, 5, 6};
        int k2 = 5;
        int[] numbers3 = {1, 2, 3};
        int k3 = 3;
        System.out.println(s.solution(numbers3,k3));
    }

}
//import java.util.LinkedList;
//        import java.util.List;
////class Solution {
////    public int solution(int[] numbers, int k) {
////        int answer = 0; // k번째로 공을 던지는 사람의 번호
////        int count = 0;
////        List temp = new LinkedList();
////        for (int num : numbers) {
////            temp.add(num);
////        }
////        for (int i = 0; i < numbers.length; i++) {
////            count++;
////            if (count == k-1) {
////                answer = (int) temp.get(numbers.length/k);
////                break;
////            }
////        }
////        return answer;
////    }
////}