package LV_0.제일작은수제거하기;

public class Solution {
    public int[] solution(int[] arr) {
        // 만약 배열이 하나의 요소만을 갖고 있다면, -1을 담은 배열을 반환합니다.
        if (arr.length <= 1) {
            return new int[]{-1};
        }

        // 가장 작은 수를 찾습니다.
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // 가장 작은 수를 제외한 나머지 수를 저장할 배열을 생성합니다.
        int[] answer = new int[arr.length - 1];
        int idx = 0;
        for (int num : arr) {
            if (num != min) {
                answer[idx] = num;
                idx++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {4,3,2,1};
        System.out.println(s.solution(arr));
    }
}
