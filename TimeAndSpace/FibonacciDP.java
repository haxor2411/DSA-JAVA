package TimeAndSpace;

import java.util.Arrays;

public class FibonacciDP {
    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n + 1];
        fibonacciM(n, dp);
        System.out.println("Fibonacci Memorized " + Arrays.toString(dp));
        System.out.println("Fibonacci Tabulation " + fibonacciT(n));
        System.out.println("Fibonacci Tabulation Optimized " + fibonacciTO(n));
    }

    //Memorisation
    //Algo starts by asking difficult question
    //T.C => O(n) and S.C => O(n) and T.O => 2N - 1
    static int fibonacciM(int n, int[] dp){
        if(n == 0 || n == 1) return dp[n] = n;
        if(dp[n] != 0) return dp[n];
        return dp[n] = fibonacciM(n - 1, dp) + fibonacciM(n - 2, dp);
    }

    //Tabulation
    //Algo starts with asking easiest question
    //T.C => O(n) and S.C => O(n)
    static int fibonacciT(int n){
        int[] dp = new int[n + 1];
        for(int i = 0; i <= n; i++){
            if(i == 0 || i == 1) dp[i] = i;
            else dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }

    //Tabulation Optimized
    //T.C => O(n) and S.C => O(1)
    static int fibonacciTO(int n){
        if(n == 0 || n == 1) return n;
        int f = 0, s = 1;
        for(int i = 2; i <= n; i++){
            int t = f + s;
            f = s;
            s = t;
        }
        return s;
    }
}
