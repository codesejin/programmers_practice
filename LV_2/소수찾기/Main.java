package LV_2.소수찾기;

import java.util.Scanner;

public class Main {
    int[][] dy = new int[35][35]; // 입력값 최대 32보다 더 널널하게 잡음
    public int DFS(int n, int r) {
        // 이미 저장된 값이 있다면 재귀 뻗지 말고 리턴
        if (dy[n][r] > 0) return dy[n][r];
        if (n==r || r == 0) return 1;
        // 2차원 배열 dy에 저장
        else return dy[n][r] = DFS(n-1,r-1)+DFS(n-1,r);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        System.out.println(T.DFS(n,k));

    }
}
