package LV_0.구슬을나누는경우의수;

//DFS활용
public class DFS {
    int[][] dy = new int[31][31];
    public int solution(int balls, int share) {
        if (dy[balls][share] > 0) return dy[balls][share];
        if (balls == share || share == 0) return 1;
        else return dy[balls][share] = solution(balls - 1, share - 1) + solution(balls - 1, share);
    }

    public static void main(String[] args) {
        DFS T = new DFS();
        int balls = 5;
        int share = 3;
        System.out.println(T.solution(balls, share));
    }
}
