package LV_0.원하는문자열찾기;

public class Solution {
    public int solution(String myString, String pat) {
        int answer = 1;
        if(myString.toLowerCase().indexOf(pat.toLowerCase()) == -1) return 0;
        return answer;
    }
}
