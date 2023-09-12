package LV_0.문자열몇번등장하는지세기;

public class Solution {
    public int solution(String myString, String pat) {
        System.out.println(myString);
        System.out.println(myString.substring(1));
        System.out.println(myString.substring(0,1));
        int cnt = 0;
        for(int i=0; i<myString.length(); i++) {
            if(myString.substring(i).startsWith(pat)){
                cnt++;
            }
        }
        return cnt;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        String myString = "banana";
        String pat = "ana";
        System.out.println(s.solution(myString, pat));
    }
}
