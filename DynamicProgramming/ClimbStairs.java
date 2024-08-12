package DynamicProgramming;

import java.util.Arrays;

public class ClimbStairs {
    public static void main(String[] args) {
        int n = 2;
        int[] dp = new int[n + 1];
        System.out.println(climbStairs(n, dp));
        System.out.println(climbStairsT(n));
        System.out.println(climbStairsTO(n));
    }

    //Memorization
    //T.C => O(n) & S.C => O(n) & Stack Memory
    static int climbStairs(int n, int[] dp){
        if(n == 0) return dp[0] = 1;
        else if(dp[n] != 0) return dp[n];
        else if(n == 1) dp[n] = climbStairs(n - 1, dp);
        else if(n == 2) return dp[n] = climbStairs(n - 1, dp) + climbStairs(n - 2, dp);
        else return dp[n] = climbStairs(n - 1, dp) + climbStairs(n - 2, dp) + climbStairs(n - 3, dp);
        return dp[n];

        //You can reduce the check condn by checking applicalbe calls directly...Refer below code for guidance

        // if(n < 0) return 0;
        // if(n == 0) return dp[0] = 1;
        // if(dp[n] != 0) return dp[n];
        // return dp[n] = climbStairs(n - 1, dp) + climbStairs(n - 2, dp) + climbStairs(n - 3, dp);
    }

    //Tabulation
    //T.C => O(n) & S.C => O(n)
    static int climbStairsT(int n){
        int[] dp = new int[n + 1];
        for(int i = 0; i <= n; i++){
            if(i == 0) dp[i] = 1;
            else if(i == 1) dp[i] = dp[i - 1];
            else if(i == 2) dp[i] = dp[i - 1] + dp[i - 2];
            else dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }

    //Tabulation Optimized
    //T.C => O(n) & S.C => O(1)
    static int climbStairsTO(int n){
        if(n == 0 || n == 1) return 1;
        if(n == 2) return 2;
        int f = 1, s = 1, t = f + s;
        for(int i = 3; i <= n; i++){
            int x = f + s + t;
            f = s;
            s = t;
            t = x;
        }
        return t;
    }
}
