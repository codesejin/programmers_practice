package LV_0.수조작하기2;

public class Other {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i=1; i<numLog.length; i++){
            int j = numLog[i-1] - numLog[i];
            switch(j){
                case -1 : answer+='w'; break;
                case 1 : answer+='s'; break;
                case -10 : answer+='d'; break;
                case 10 : answer+='a'; break;
            }
        }
        return answer;
    }
}
