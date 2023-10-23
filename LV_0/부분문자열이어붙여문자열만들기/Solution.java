package LV_0.부분문자열이어붙여문자열만들기;

public class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        int len = my_strings.length;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++) {
            int start = parts[i][0];
            int end = parts[i][1];
            String tmp = my_strings[i].substring(start,end+1);
            sb.append(tmp);
        }
        return sb.toString();
    }
}
