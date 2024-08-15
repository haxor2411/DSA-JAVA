package DynamicProgramming;

public class GoldMine {
    public static void main(String[] args) {
        int matrix[][] = {{0,1,4,2,8,2},{4,3,6,5,0,4},{1,2,4,1,4,6},{2,0,7,3,2,2},{3,1,5,9,2,4},{2,7,0,8,5,1}};
        System.out.println(maxGold(matrix));
    }

    static int maxGold(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;

        int[][] dp = new int[m][n];

        for(int col = 0; col < n; col++){
            for(int row = 0; row < m; row++){ 
                if(col == 0) dp[row][col] = arr[row][col];
                else if(row == 0) dp[row][col] = Math.max(dp[row][col - 1], dp[row + 1][col - 1]) + arr[row][col];
                else if(row == m - 1) dp[row][col] = Math.max(dp[row][col - 1], dp[row - 1][col - 1]) + arr[row][col];
                else dp[row][col] = Math.max(dp[row][col - 1], Math.max(dp[row + 1][col - 1], dp[row - 1][col - 1])) + arr[row][col];
            }
        }

        int max = Integer.MIN_VALUE;
        for(int row = 0; row < m; row++){
            max = max < dp[row][n - 1] ? dp[row][n - 1] : max;
        }

        return max;
    }
}
