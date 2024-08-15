package DynamicProgramming;

import java.util.Arrays;

public class MinCostMazeTraversal {
    public static void main(String[] args) {
        int matrix[][] = {{0,1,4,2,8,2},{4,3,6,5,0,4},{1,2,4,1,4,6},{2,0,7,3,2,2},{3,1,5,9,2,4},{2,7,0,8,5,1}};
        System.out.println(minCostMazeTraversal(matrix));
    }

    static int minCostMazeTraversal(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int[][] dp = new int[m][n];
        for(int i = m - 1; i >= 0; i--){
            for(int j = n - 1;j >= 0; j--){
                if(i == m - 1 && j == n - 1) dp[i][j] = arr[i][j];
                else if(i == m - 1) dp[i][j] = dp[i][j + 1] + arr[i][j];
                else if(j == n - 1) dp[i][j] = dp[i + 1][j] + arr[i][j];
                else dp[i][j] = Math.min(dp[i + 1][j], dp[i][j + 1]) + arr[i][j];
            }
        }
        for(int i = 0; i < m; i++){
            System.out.println(Arrays.toString(dp[i]));
        }
        return dp[0][0];
    }
}
