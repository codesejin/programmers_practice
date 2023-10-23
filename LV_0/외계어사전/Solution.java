package LV_0.외계어사전;


public class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for (String k : dic) {
            boolean allCheck = true;
            for (String x : spell) {
                if (k.indexOf(x) == -1) {
                    allCheck = false;
                    break;
                }
                k.charAt()
            }
            if (allCheck) answer = 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String[] spell1 = {"p", "o", "s"};
        String[] spell2 = {"z", "d", "x"};
        String[] dic1 = {"sod", "eocd", "qixm", "adio", "soo"};
        String[] dic2 = {"def", "dww", "dzx", "loveaw"};
        String[] dic3 ={"pppp", "oooo", "ssss", "spso"};
        System.out.println(T.solution(spell2, dic2));
    }
}
