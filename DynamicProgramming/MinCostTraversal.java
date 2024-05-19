package DynamicProgramming;
public class MinCostTraversal {
    public static void main(String[] args) {
        int n = 6;
        int m = 6;
        int matrix[][] = {{0,1,4,2,8,2},{4,3,6,5,0,4},{1,2,4,1,4,6},{2,0,7,3,2,2},{3,1,5,9,2,4},{2,7,0,8,5,1}};    
        System.out.println(minCostTraversal(n, m, matrix));
    }
    public static int minCostTraversal(int n, int m, int[][] matrix){
        int dp[][] = new int[n][m];
        int nr = matrix.length;
        int nc = matrix[0].length;
        for(int r = nr - 1; r >= 0; r--){
            for(int c = nc - 1; c >= 0; c--){
                if(r == nr - 1 && c == nc - 1){
                    dp[r][c] = matrix[r][c];
                }
                else if(r == nr-1){
                    dp[r][c] = dp[r][c + 1] + matrix[r][c];
                }
                else if(c == nc - 1){
                    dp[r][c] = dp[r + 1][c] + matrix[r][c];
                }
                else{
                    dp[r][c] = Math.min(dp[r][c + 1], dp[r + 1][c]) + matrix[r][c];
                }
            }
        }
        return dp[0][0];
    }
}
