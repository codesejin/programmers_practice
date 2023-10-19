package LV_0.그림확대;

public class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        StringBuilder sb = new StringBuilder();
        int idx = 0, count = 0;
        for (int i = 0; i < picture.length; i++) {
            String target = picture[i];
            for (int j = 0; j < target.length(); j++) {
                String t = String.valueOf(target.charAt(j)).repeat(k);
                sb.append(t);
            }
            while (count < k) {
                answer[idx++] = sb.toString();
                count++;
            }
            count = 0;
            sb.delete(0, sb.length());
        }
        return answer;
    }
}
