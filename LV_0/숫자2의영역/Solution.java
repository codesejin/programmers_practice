package LV_0.숫자2의영역;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;

        // 최소 최대 인덱스 값 구하기
        int minIndex = Integer.MAX_VALUE;
        int maxIndex = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            if (arr[i] == 2) {
                minIndex = Math.min(minIndex, i);
                maxIndex = Math.max(maxIndex, i);
            }
        }
        // 최소 최대 인뎃스 사이의 값 List에 저장
        List<Integer> integerList = new ArrayList<>();
        for (int i = minIndex ; i <= maxIndex; i++) {
            integerList.add(arr[i]);
        }
        // list가 비었을 경우 -1 반환
        if (integerList.isEmpty()) {
            return new int[]{-1};
        }

        return integerList.stream().mapToInt(Integer::intValue).toArray();
//        int[] intArray = new int[integerList.size()];
//        for (int i = 0; i < integerList.size(); i++) {
//            intArray[i] = integerList.get(i);
//        }
//        return intArray;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr1 = {1, 2, 1, 4, 5, 2, 9};
        int[] arr2 = {1, 2, 1};
        int[] arr3 = {1, 1, 1};
        int[] arr4 = {2, 1, 2, 1, 10, 2};
        System.out.println(Arrays.toString(s.solution(arr4)));
    }
}
