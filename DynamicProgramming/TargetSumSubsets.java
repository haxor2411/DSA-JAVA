package DynamicProgramming;


public class TargetSumSubsets {
    public static void main(String[] args) {
        int[] arr = {4,2,7,1,3};
        int target = 10;
        System.out.println(sumSubset(arr, target));
    }

    static boolean sumSubset(int[] arr, int target){
        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][target + 1];
        dp[0][0] = true;
        for(int r = 1; r <= n; r++){
            for(int c = 0; c <= target; c++){
                if(c == 0) dp[r][c] = true;
                else if(c < arr[r - 1]) dp[r][c] = dp[r - 1][c];
                else dp[r][c] = dp[r - 1][c] || dp[r - 1][c - arr[r - 1]];
            }
            if(dp[r][target]) return true;
        }
        return false;
    }
}
