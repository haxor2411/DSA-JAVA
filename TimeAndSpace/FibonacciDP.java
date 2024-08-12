package TimeAndSpace;

public class FibonacciDP {
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        for(int i = 0; i <= n; i++){
            System.out.print(fibonacci(i, dp) + " ");
        }
    }

    static int fibonacci(int n, int[] dp){
        if(n == 0 || n == 1) return dp[n] = n;
        if(dp[n] != 0) return dp[n];
        return dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);
    }
}
