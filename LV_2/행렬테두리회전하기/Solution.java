package LV_2.행렬테두리회전하기;

import java.util.Arrays;

/**
 * 행렬 알고리즘
 * @See https://velog.io/@ckr3453/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%ED%96%89%EB%A0%AC-%ED%85%8C%EB%91%90%EB%A6%AC-%ED%9A%8C%EC%A0%84%ED%95%98%EA%B8%B0-Java
 * @See https://rovictory.tistory.com/17
 */
public class Solution {

    public static void main(String[] args) {
        int rows = 6;
        int columns = 6;
        int[][] queries = {{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}};
        new Solution().solution(rows,columns, queries);
    }
    public int[] solution(int rows, int columns, int[][] queries) {
        int[][] square = initSquare(rows, columns);
        return rotateNums(square, queries);
    }
    public static int[] rotateNums(int[][] square, int[][] queries){
        int[] answer = new int[queries.length];
        int minimalsIdx=0;

        for(int[] query : queries){
            // 인덱스
            int x1 = query[0]-1;
            int y1 = query[1]-1;
            int x2 = query[2]-1;
            int y2 = query[3]-1;
            // 시작할 넘버
            int firstNum = square[x1][y2];
            // 행렬을 돌리면서 최솟값을 찾아서 리턴해야함
            int min = firstNum;

            // 숫자를 우로 이동 (상단)
            for(int i=y2-1; i>=y1; i--){
                min = Math.min(min, square[x1][i]);
                square[x1][i+1] = square[x1][i];
            }

            // 숫자를 위로 이동 (좌측)
            for(int i=x1+1; i<=x2; i++){
                min = Math.min(min, square[i][y1]);
                square[i-1][y1] = square[i][y1];
            }

            // 숫자를 좌로 이동 (하단)
            for(int i=y1+1; i<=y2; i++){
                min = Math.min(min, square[x2][i]);
                square[x2][i-1] = square[x2][i];
            }

            // 숫자를 아래로 이동 (우측)
            for(int i=x2-1; i>=x1; i--){
                min = Math.min(min, square[i][y2]);
                square[i+1][y2] = square[i][y2];
            }

            square[x1+1][y2] = firstNum;
            answer[minimalsIdx] = min;
            minimalsIdx++;
        }

        return answer;
    }

    public static int[][] initSquare(int rows, int columns){
        int[][] square = new int[rows][columns];
        int value = 1;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                square[i][j] = value++;
            }
        }
        return square;
    }
}
