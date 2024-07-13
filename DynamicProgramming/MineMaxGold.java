package DynamicProgramming;

public class MineMaxGold {
    public static void main(String[] args) {
        int n = 6;
        int m = 6;
        int matrix[][] = {{0,1,4,2,8,2},{4,3,6,5,0,4},{1,2,4,1,4,6},{2,0,7,3,2,2},{3,1,5,9,2,4},{2,7,0,8,5,1}};
        System.out.println(mineMaxGold(n, m, matrix));
    }
    public static int mineMaxGold(int n, int m, int[][]matrix){
        int dp[][] = new int[n][m];
        for(int r = n - 1; r >= 0; r--){
            for(int c = m - 1; c >= 0; c--){
                if(r == 0 && c != m - 1){
                    dp[r][c] = Math.max(dp[r][c + 1], dp[r + 1][c + 1]) + matrix[r][c];
                }
                else if(c == m - 1){
                    dp[r][c] = matrix[r][c];
                }
                else if(r == n - 1 && c != m - 1){
                    dp[r][c] = Math.max(dp[r][c + 1], dp[r - 1][c + 1]) + matrix[r][c];
                }
                else{
                    dp[r][c] = Math.max(Math.max(dp[r][c + 1], dp[r + 1][c + 1]), dp[r - 1][c + 1]) + matrix[r][c];
                }
            }
        }
        return dp[0][0];
    }
}
