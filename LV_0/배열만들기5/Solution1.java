package LV_0.배열만들기5;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public int[] solution(String[] intStrs, int k, int s, int l) {

        List<Integer> tempList = new ArrayList<>();
        int idx = 0;
        for (int i = 0; i < intStrs.length; i++) {
            // s번째 인덱스에서 l짜리까지 자르기
            String substring = intStrs[i].substring(s, s + l);
            // parseInt랑 차이 알아봐야함
            if (Integer.valueOf(substring) > k) {
                tempList.add(Integer.valueOf(substring));
            }
        }
        // 다른사람들 보니까 stream 쓰는거 같은데, Stream 아직 잘 모릅니다
        int[] answer = new int[tempList.size()];
        for (int num : tempList) {
            answer[idx++] = num;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] intStrs = {"0123456789", "9876543210", "9999999999999"};
        int k = 50000;
        int s = 5;
        int l = 5;

        Solution1 solution1 = new Solution1();
        solution1.solution(intStrs, k, s, l);
    }
}
