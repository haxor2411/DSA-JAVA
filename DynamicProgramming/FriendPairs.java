package DynamicProgramming;

import java.util.Arrays;
//This ques is a derivative of fibonacci 
public class FriendPairs {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(pairs(n));
        System.out.println(pairs2(n));
    }

    //dp[n] = d[n - 1] + (i - 1) * dp[n - 2];
    static int pairs(int n){
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
    
    // Optimal Way
    static int pairs2(int n){
        if(n == 0 || n == 1 ) return 1;
        int f = 1, s = 1;
        for(int i = 2; i <= n; i++){
            int t = s + (i - 1) * f;
            f = s;
            s = t;
        }

        return s;
    }
}
