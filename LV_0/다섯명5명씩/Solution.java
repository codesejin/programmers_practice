package LV_0.다섯명5명씩;

public class Solution {

    public String[] solution(String[] names) {
        int count = (names.length % 5 != 0) ? (names.length / 5) + 1 : (names.length / 5);
        String[] answer = new String[count];
        int idx = 0;
        for (int i = 0; i < names.length ; i++) {
            if (i % 5 == 0 ) answer[idx++] = names[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        System.out.println(T.solution(names));
    }
}
