package DynamicProgramming;

public class MaxSumNonAdjElem {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {5,10,10,100,5,6};
        System.out.println(maxSum(n, arr));
    }

    static int maxSum(int n, int[] arr){
        int[][] dp = new int[2][n]; //Row 0 -> exclude the current elem && Row 1 -> inlcude the current elem
        
        dp[1][0] = arr[0];
        for(int col = 1; col < n; col++){
            dp[0][col] = Math.max(dp[0][col - 1], dp[1][col - 1]);
            dp[1][col] = arr[col] + dp[0][col - 1];
        }
        return Math.max(dp[0][n - 1], dp[1][n - 1]);
    }
}
