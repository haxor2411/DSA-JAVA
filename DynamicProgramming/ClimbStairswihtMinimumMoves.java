package DynamicProgramming;

import java.util.Scanner;

public class ClimbStairswihtMinimumMoves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] moves = new int[n];
        for(int idx = 0; idx < n; idx++){
            moves[idx] = sc.nextInt();
        }
        System.out.println(climbStairswihtMinimumMoves(n, moves));
    }

    public static int climbStairswihtMinimumMoves(int n, int[] moves){
        int[] dp = new int[n + 1];
        dp[n] = 0;
        for(int idx = n - 1; idx >= 0; idx--){
            if(moves[idx] > 0){
                int min_move = Integer.MAX_VALUE;
                for(int len = 1; len <= moves[idx] && len + idx <= n; len++){
                    min_move = Math.min(min_move, dp[len + idx] + 1);
                }
                dp[idx] = min_move;
            }
        }
        return dp[0];
    }
}