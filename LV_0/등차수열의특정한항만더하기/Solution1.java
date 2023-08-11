package LV_0.등차수열의특정한항만더하기;

public class Solution1 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        // included랑 똑같은 사이즈인 배열 만들기
        int[] intArray  = new int[included.length];
        int idx = 0;
        // 첫째항부터 공차 계산한 걸 배열에 집어넣기
        int count = 1;
        for (int i = a; i <= 100; i+=d) {
            if (count <= included.length) {
                intArray[idx++] = i;
                count++; // - count가 included 배열의 길이보다 커지면 배열의 크기를 초과하게 된다
            } else {
                break;
            }
        }
        // included배열에서 true인 인덱스만 찾아서 더하기
        for (int i = 0; i < included.length ; i++) {
            if (included[i] == true) {
                answer += intArray[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int a = 3;
        int d = 4;
        boolean[] included = {true, false, false, true, true, true}; // 길이가 6인 배열

        Solution1 solution1 = new Solution1();
        int solution = solution1.solution(a, d, included);
        System.out.println("solution = " + solution);

    }
}
