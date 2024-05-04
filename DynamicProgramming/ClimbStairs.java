package DynamicProgramming;

import java.util.Scanner;

public class ClimbStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(climbStairs(n, new int[n + 1]));
        System.out.println(climbStairsTabulation(n));
    }
    //Memorisation
    public static int climbStairs(int n, int dp[]){
        if(n == 0){
            return dp[n] = 1;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        int tways = 0;
        if(n - 1 >= 0){
            tways += climbStairs(n - 1, dp);
        }
        if(n - 2 >= 0){
            tways += climbStairs(n - 2, dp);
        }
        if(n - 3 >= 0){
            tways += climbStairs(n - 3, dp);
        }
        return dp[n] = tways;
    }
    //OR
    //Tabulation
    public static int climbStairsTabulation(int n){
        int dp[] = new int[n + 1];
        for(int i = 0; i <= n; i++){
            if(i == 0){
                dp[i] = 1;
            }
            else if(i == 1){
                dp[i] = dp[i - 1];
            }
            else if(i == 2){
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            else{
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }
        return dp[n];
    }
}
