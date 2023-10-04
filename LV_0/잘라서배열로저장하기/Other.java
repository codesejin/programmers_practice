package LV_0.잘라서배열로저장하기;

import java.util.Arrays;

public class Other {
    public String[] solution(String my_str, int n) {
        int resultCnt = (my_str.length() + n - 1) / n;
        String[] answer = new String[resultCnt];

        for (int i = 0; i < resultCnt; i++) {
            int start = n * i;
            int end = start + n >= my_str.length() ? my_str.length() : start + n;
            answer[i] = my_str.substring(start, end);
        }

        return answer;
    }

    public static void main(String[] args) {
        Other T = new Other();
        String my_str = "abc1Addfggg4556b";
        int n = 6;
        System.out.println(Arrays.toString(T.solution(my_str, n)));
    }
}
