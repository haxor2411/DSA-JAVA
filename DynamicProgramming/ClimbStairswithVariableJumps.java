package DynamicProgramming;

import java.util.Scanner;

public class ClimbStairswithVariableJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int moves[] = new int[n];
        for(int idx = 0; idx < n; idx++){
            moves[idx] = sc.nextInt();
        }
        System.out.println(climbStairs_VarJumps(n, moves));
    }

    public static int climbStairs_VarJumps(int n, int[] moves){
        int dp[] = new int[n + 1];
        for(int i = n; i >= 0; i--){
            if(i == n){
                dp[i] = 1;
            }
            else{
                int maxJump = moves[i];
                for(int len = 1; len <= maxJump && len + i <= n; len++){
                    dp[i] += dp[i + len];
                }   
            }
        }
        return dp[0];
    }
}
