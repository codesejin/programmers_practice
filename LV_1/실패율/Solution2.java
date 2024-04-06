package LV_1.실패율;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Solution2 {
    public static void main(String[] args) {
        int N = 5; // 전체 스테이지의 개수
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};// 현재 멈춰있는 스테이지의 번호가 담긴 배열
        System.out.println(new Solution2().solution(N, stages));
    }

    public int[] solution(int N, int[] stages) {
        int nPlayers = stages.length;
        int[] nStagePlayers = new int[N + 2]; // zero based index, stages배열에 6이 있기 때문에  +1
        for (int stage : stages) {
            nStagePlayers[stage] += 1;
        }

        int remainingPlayers = nPlayers;
        List<Stage> stageList = new ArrayList<>();
        for (int id = 1 ; id <= N; id++) {
            double failure = (double) nStagePlayers[id] / remainingPlayers;
            remainingPlayers -= nStagePlayers[id];

            Stage s = new Stage(id, failure);
            stageList.add(s);
        }
        Collections.sort(stageList, Collections.reverseOrder());

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = stageList.get(i).id;
        }
        return answer;
    }

    class Stage implements Comparable<Stage> {
        public int id;
        public double failure;

        public Stage(int id_, double failure_) {
            id = id_;
            failure = failure_;
        }

        @Override
        public int compareTo(Stage o) {
            if (failure < o.failure ) {
                return -1;
            }
            if (failure > o.failure ) {
                return 1;
            }
            return 0;
        }
    }
}
