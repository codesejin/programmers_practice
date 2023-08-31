package LV_0.문자열_뒤집기;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer =  new StringBuilder(my_string).reverse();
        return answer.toString();
    }
}