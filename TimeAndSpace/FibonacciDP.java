package TimeAndSpace;

// import java.util.Arrays;

public class FibonacciDP {
    public static void main(String[] args) {
        int n = 6;
        // int[] dp = new int[n + 1];
        // fibonacciM(n, dp);
        // System.out.println(Arrays.toString(dp));
        System.out.println(fibonacciT(n));
    }

    //Memorisation
    static int fibonacciM(int n, int[] dp){
        if(n == 0 || n == 1) return dp[n] = n;
        if(dp[n] != 0) return dp[n];
        return dp[n] = fibonacciM(n - 1, dp) + fibonacciM(n - 2, dp);
    }

    //Tabulation
    static int fibonacciT(int n){
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] += dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
