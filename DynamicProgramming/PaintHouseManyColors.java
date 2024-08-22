package DynamicProgramming;

import java.util.Arrays;

public class PaintHouseManyColors {
    public static void main(String[] args) {
        int n = 5; //no of houses
        int cost[][] = {{1,5,10,0,9},{11,6,8,1,4},{9,8,97,100,10},{150,140,130,120,90},{60,70,80,10,5}};
        System.out.println(minCost(n, cost));
        System.out.println(minCost2(n, cost));
    }

    //T.C -> O(n.m ^ 2)
    static int minCost(int n, int[][] cost){
        int m = cost[0].length;
        int[][] dp = new int[n][m];

        for(int col = 0; col < m; col++) dp[0][col] = cost[0][col];

        for(int row = 1; row < n; row++){
            for(int col = 0; col < m; col++){
                int min = Integer.MAX_VALUE;
                for(int mIdx = 0; mIdx < m; mIdx++) min = (col != mIdx && min > dp[row - 1][mIdx]) ? dp[row - 1][mIdx] : min;
                dp[row][col] = cost[row][col] + min;
            }
        }
        for(int i = 0; i < n; i++) System.out.println(Arrays.toString(dp[i]));
        int ans = Integer.MAX_VALUE;
        for(int col = 0; col < m; col++) ans = (ans > dp[n - 1][col]) ? dp[n - 1][col] : ans;
        return ans;
    }

    //T.C -> O(n.m)
    static int minCost2(int n, int[][] cost){
        int m = cost[0].length;
        int[][] dp = new int[n][m];

        for(int col = 0; col < m; col++) dp[0][col] = cost[0][col];
        for(int row = 1; row < n; row++){
            int min1 = Integer.MAX_VALUE; //min value
            int min2 = Integer.MAX_VALUE; // second min value
            int min1Idx = -1;

            for(int col = 0; col < m; col++){
                if(min1 > dp[row - 1][col]){
                    min2 = min1;
                    min1 = dp[row - 1][col];
                    min1Idx = col; //index of min value
                }else if(min2 > dp[row - 1][col]) min2 = dp[row - 1][col];
            }

            for(int col = 0; col < m; col++){
                if(min1Idx == col) dp[row][col] = cost[row][col] + min2; //if minVal is already on col then place second minVal
                else dp[row][col] = cost[row][col] + min1;
            }
        }

        int ans = Integer.MAX_VALUE;
        for(int col = 0; col < m; col++) ans = (ans > dp[n - 1][col]) ? dp[n - 1][col] : ans;
        return ans;
    }
}
