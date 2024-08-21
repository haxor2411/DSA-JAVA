package DynamicProgramming;
public class TilingMX1 {
    public static void main(String[] args) {
        int n = 39, m = 16;
        System.out.println(nWays(n, m));
    }

    static int nWays(int n, int m){
        int[] dp = new int[n + 1];
        for(int i = 0; i <= n; i++){
            if(i < m) dp[i] = 1;
            else if(i == m) dp[i] = 2;
            else dp[i] = dp[i - 1] + dp [i - m];
        }
        return dp[n];
    }
}
