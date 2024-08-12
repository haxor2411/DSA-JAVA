package TimeAndSpace;

import java.util.Arrays;

public class FibonacciDP {
    public static void main(String[] args) {
        int n = 6;
        // int[] dp = new int[n + 1];
        // fibonacciM(n, dp);
        // System.out.println(Arrays.toString(dp));
        System.out.println(fibonacciT(n));
    }

    //Memorisation
    //Algo starts by asking difficult question
    static int fibonacciM(int n, int[] dp){
        if(n == 0 || n == 1) return dp[n] = n;
        if(dp[n] != 0) return dp[n];
        return dp[n] = fibonacciM(n - 1, dp) + fibonacciM(n - 2, dp);
    }

    //Tabulation
    //Algo starts with asking easiest question
    static int fibonacciT(int n){
        int[] dp = new int[n + 1];
        for(int i = 0; i <= n; i++){
            if(i == 0 || i == 1) dp[i] = i;
            else dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}
