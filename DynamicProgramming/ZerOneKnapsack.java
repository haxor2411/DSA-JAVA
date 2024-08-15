package DynamicProgramming;

import java.util.Arrays;

public class ZerOneKnapsack {
    public static void main(String[] args) {
        int n = 5;
        int[] value = {15,14,10,45,30};
        int[] weight = {2,5,1,3,4};
        int target = 7;
        System.out.println(knapsack(value, weight, target, n));
    }

    static int knapsack(int[] value, int[] weight, int target, int n){
        int[][] dp = new int[n + 1][target + 1];

        for(int r = 1; r <= n; r++){
            for(int c = 1; c <= target; c++){
                if(c < weight[r - 1]) dp[r][c] = dp[r - 1][c];
                else dp[r][c] = Math.max(dp[r - 1][c], value[r - 1] + dp[r - 1][c - weight[r - 1]]);
            }
        }

        //just for checking the dp array filling
        for(int i = 0; i <= n; i++){
            System.out.println(Arrays.toString(dp[i]));
        }
        // ans at last position
        return dp[n][target];
    }
}
