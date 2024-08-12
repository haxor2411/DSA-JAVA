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
        sc.close();
    }

    public static int climbStairswihtMinimumMoves(int n, int[] moves){
        int dp[] = new int[n + 1];
        for(int i = n;i >= 0; i--){
            if(i == n){
                dp[i] = 0;
            }
            else{
                int min_move = Integer.MAX_VALUE;
                int maxJump = moves[i];
                for(int jmp = 1; jmp <= maxJump && jmp + i <= n; jmp++){
                    min_move = Math.min(min_move, dp[i + jmp]);
                }
                if(min_move == Integer.MAX_VALUE){
                    dp[i] = min_move;
                }
                else{
                    dp[i] = min_move + 1;
                }
            }
        }
        return dp[0];
    }
}