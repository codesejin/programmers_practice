package LV_0.배열의길이에따라다른연산하기;

public class Other2 {
    public int[] solution(int[] arr, int n) { // n = 27
        // 길이가 홀수일때 짝수 인덱스에 더하기 = [49, 12, 100, 276, 33] -> [76, 12, 127, 276, 60]
        // 길이가 짝수일때 홀수 인덱스에 더하기 = [49, 12, 100, 276] -> [49, 39, 100, 303]
        for (int i = arr.length - 1; i >= 0; i -= 2) {
            arr[i] += n;
        }
        return arr;
    }
}
