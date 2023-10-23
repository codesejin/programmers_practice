package LV_0.문자열바꿔서찾기;

public class Solution {
    public int solution(String myString, String pat) {
        int answer = 1;
        String temp = pat.replace("B","-").replace("A","*");
        temp = temp.replace("-","A").replace("*","B");
        if (myString.indexOf(temp) == -1) answer = 0;
        return answer;
    }
}
