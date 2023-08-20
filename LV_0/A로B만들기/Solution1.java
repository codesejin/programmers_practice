package LV_0.A로B만들기;

import java.util.Arrays;

public class Solution1 {
    public int solution(String before, String after) {
        // 순서롤 뒤에서부터 뒤집으면 되는걸 줄 알았는데 그게 아닌가봄
        // 정확도 65.점
        int answer = 0;
//        char[] chars = before.toCharArray();
//        String temp = "";
//        for (int i = chars.length-1; i >= 0 ; i--) {
//            temp += chars[i];
//        }
//        System.out.println("temp = " + temp);
//        if (temp.equals(after)) return 1;
//        return answer;

        char[] before2 = before.toCharArray();
        char[] after2 = after.toCharArray();
        Arrays.sort(before2);
        Arrays.sort(after2);

        String before3 = new String(before2);
        String after3 =  new String(after2);

        if (before3.equals(after3)) return 1;
        return answer;
    }

    public static void main(String[] args) {
        String before = "olleh";
        String after = "hello";
        Solution1 solution1 = new Solution1();
        solution1.solution(before, after);
    }
}
