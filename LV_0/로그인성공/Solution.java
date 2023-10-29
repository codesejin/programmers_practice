package LV_0.로그인성공;

public class Solution {

    private static final String LOGIN = "login";
    private static final String WRONG_PW = "wrong pw";
    private static final String FAIL = "fail";

    public String solution(String[] id_pw, String[][] db) {
        String myId = id_pw[0];
        String myPw = id_pw[1];
        for (int i = 0; i < db.length; i++) {
            String dbId = db[i][0];
            String dbPw = db[i][1];
            if (myId.equals(dbId) && myPw.equals(dbPw)) return LOGIN;
            else if (myId.equals(dbId)) return WRONG_PW;
        }
        return FAIL;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String[] id_pw = {"programmer01", "15789"};
        String[][] db = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
        System.out.println(T.solution(id_pw,db));
    }
}
