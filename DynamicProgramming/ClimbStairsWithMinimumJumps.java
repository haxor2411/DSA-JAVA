package DynamicProgramming;

import java.util.Arrays;

public class ClimbStairsWithMinimumJumps {
    public static void main(String[] args) {
        int[] arr = {3,3,0,2,1,2,4,2,0,0};
        int n = arr.length;
        System.out.println(climbStairsWithMinimumJumps(n, arr));
    }

    static int climbStairsWithMinimumJumps(int n, int[] arr){
        int[] dp = new int[n + 1];
        for(int i = n - 1; i >= 0; i--){
            if(arr[i] == 0) continue;
            else{
                int min = Integer.MAX_VALUE;
                for(int j = 1; j <= arr[i] && i + j <= n; j++){
                    if(i + j == n){
                        dp[i] = 1;
                        break;
                    }
                    min = (dp[i + j] > 0 && min > dp[i + j]) ? dp[i + j] : min;      
                } 
                if(min != Integer.MAX_VALUE) dp[i] = 1 + min;
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[0];
    }
}
