package DynamicProgramming;

import java.util.Arrays;

public class ClimbStairsWithVariableJumps {
    public static void main(String[] args) {
        int[] arr = {3,3,0,2,1,2,4,2,0,0};
        int n = arr.length;
        System.out.println(climbStairsWithVariableJumps(n, arr));        
        System.out.println(climbStairsWithVariableJumpsTO(n, arr));
    }

    //Tabulation
    //T.C => O(N ^ 2) & T.O => O(N)
    static int climbStairsWithVariableJumps(int n, int[] arr){
        int[] dp = new int[n + 1];
        for(int i = n; i >= 0; i--){
            if(i == n) dp[n] = 1;
            else if(arr[i] == 0) continue;
            else for(int j = 1; j <= arr[i] && i + j <= n; j++) dp[i] += dp[i + j];
            }   
        System.out.println(Arrays.toString(dp));
        return dp[0];
    }

    //Optimized Sliding Window Solution
    //T.C => O(N ^ 2) & T.O => O(1)
    static int climbStairsWithVariableJumpsTO(int n, int[] arr){
        for(int i = n - 1; i >= 0; i--){
            int tWays = 0;
            if(arr[i] == 0) continue;
            else{
                for(int j = 1; j <= arr[i]; j++) tWays += (i + j == n) ? 1 : arr[i + j];
            }
            arr[i] = tWays;
        }
        return arr[0];
    }
}
