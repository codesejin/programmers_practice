package LV_0.문자열반복해서출력하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

    public String solution(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
////        Solution s = new Solution();
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.read();
////        String space = br.read();
////        int n = Integer.parseInt(br.readLine());
//        System.out.println(s.solution(str, n));
    }


}
