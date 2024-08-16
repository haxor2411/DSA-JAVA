package DynamicProgramming;

public class CountBinaryStrings {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countStrings(n));
        System.out.println(countString2(n));
        System.out.println(countString3(n));
    }

    static int countStrings(int n){
        if(n == 0) return 0;
        if(n == 1) return 2;
        int[][] dp = new int[2][n + 1];
        dp[0][1] = 1;
        dp[1][1] = 1;

        for(int col = 2; col <= n; col++){
            dp[0][col] = dp[1][col - 1];
            dp[1][col] = dp[0][col - 1] + dp[1][col - 1];
        }
        return dp[0][n] + dp[1][n];
    }


    static int countString2(int n){
        if(n == 0) return 1;
        if(n == 1) return 2;
        int[] dp0 = new int[n + 1];
        int[] dp1 = new int[n + 1];

        dp0[1] = 1;
        dp1[1] = 1;

        for(int i = 2; i <= n; i++){
            dp0[i] = dp1[i - 1]; 
            dp1[i] = dp1[i - 1] + dp0[i - 1]; 
        }

        return dp0[n] + dp1[n];
    }

    static int countString3(int n){
        if(n == 0) return 1;
        if(n == 1) return 2;

        int a = 1;
        int b = 1;

        for(int i = 2; i <= n; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        return a + b;
    }
}
