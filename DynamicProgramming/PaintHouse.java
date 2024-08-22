package DynamicProgramming;

import java.util.Arrays;

//Min cost to paint all the houses such that no two consecutive houses have same color;

public class PaintHouse {
    public static void main(String[] args) {
        int n = 4;
        int[][] cost = {{1,5,7},{5,8,4},{3,2,9},{1,2,4}};
        System.out.println(minCost(n, cost));
        System.out.println(minCost2(n, cost));
    }

    static int minCost(int n, int[][] cost){
        int[][] dp = new int[n][3];
        for(int row = 0; row < n; row++){
            if(row == 0){
                dp[row][0] = cost[row][0];
                dp[row][1] = cost[row][1];
                dp[row][2] = cost[row][2];
            }
            else{
                dp[row][0] = cost[row][0] + Math.min(dp[row - 1][1], dp[row - 1][2]);
                dp[row][1] = cost[row][1] + Math.min(dp[row - 1][0], dp[row - 1][2]);
                dp[row][2] = cost[row][2] + Math.min(dp[row - 1][0], dp[row - 1][1]);
            }
        }
        for(int i = 0; i < n; i++) System.out.println(Arrays.toString(dp[i]));
        return Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2]));
    }

    static int minCost2(int n, int[][] cost){
        int Rcost = cost[0][0];
        int Bcost = cost[0][1];
        int Gcost = cost[0][2];

        for(int i = 1; i < n; i++){
            int newRcost = cost[i][0] + Math.min(Bcost, Gcost);
            int newBcost = cost[i][1] + Math.min(Rcost, Gcost);
            int newGcost = cost[i][2] + Math.min(Rcost, Bcost);

            Rcost = newRcost;
            Bcost = newBcost;
            Gcost = newGcost;
        }

        return Math.min(Rcost, Math.min(Bcost, Gcost));
    }
}
