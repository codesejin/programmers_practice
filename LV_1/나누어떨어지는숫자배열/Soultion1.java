package LV_1.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soultion1 {
    public int[] solution(int[] arr, int divisor) {

        int[] answer = {};

        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                tempList.add(arr[i]);  // arr[i]를 divisor로 나눠떨어지는것만 리스트로 저장
            }
        }
        final int SIZE = tempList.size();

        if (SIZE > 0) { // 리스트에 1개라도 있을때는 배열로 옮겨서 저장
            answer = new int[SIZE];
            for (int i = 0; i < SIZE; i++) {
                answer[i] = tempList.get(i);
            }
            Arrays.sort(answer);
        }else { // 리스트에 1개도 없을때는 -1 저장
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Soultion1 soultion1 = new Soultion1();
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        soultion1.solution(arr, divisor);
    }
}
