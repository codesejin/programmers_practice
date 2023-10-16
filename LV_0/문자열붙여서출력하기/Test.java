package LV_0.문자열붙여서출력하기;

import java.util.Arrays;

public class Test {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int [] rowMax = new int[n];
        int [] colMax = new int[n];

        for(int i=0;i<n;i++){
            rowMax[i]=grid[i][0];
            colMax[i]=grid[0][i];
            for(int j=0; j<n; j++){
                rowMax[i]=Math.max(rowMax[i], grid[i][j]);
//                colMax[i]= Math.max(colMax[i], grid[j][i]);
                colMax[i]= Math.max(colMax[j], grid[i][j]); //라이언
            }
        }
        System.out.println(Arrays.toString(rowMax));
        System.out.println(Arrays.toString(colMax));
        return 0;
    }
    public static void main(String[] args) {
        Test T = new Test();
        int[][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        System.out.println(T.maxIncreaseKeepingSkyline(grid));
    }
}
