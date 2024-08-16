package DynamicProgramming;

import java.util.Arrays;

public class CountABCSubsequences {
    public static void main(String[] args) {
        String str = "abcabc";
        System.out.println(countSubsequence(str));
        System.out.println(count2(str));
    }

    static int countSubsequence(String str){
        int n = str.length();
        int[][] dp = new int[3][n + 1];

        for(int col = 1; col <= n; col++){
            if(str.charAt(col - 1) == 'a') {
                dp[0][col] = 2 * dp[0][col - 1] + 1;
                dp[1][col] = dp[1][col - 1];
                dp[2][col] = dp[2][col - 1];
            } //Row 0 -> a+ strings
            if(str.charAt(col - 1) == 'b') {
                dp[0][col] = dp[0][col - 1];
                dp[1][col] = 2 * dp[1][col - 1] + dp[0][col];
                dp[2][col] = dp[2][col - 1];
            } //Row 1 -> a+b+ strings
            if(str.charAt(col - 1) == 'c') {
                dp[0][col] = dp[0][col - 1];
                dp[1][col] = dp[1][col - 1];
                dp[2][col] = 2 * dp[2][col - 1] + dp[1][col];
            } //Row 2 -> a+b+c+ strings
        }

        //for debugging
        for(int row = 0; row <= 2; row++){
            System.out.println(Arrays.toString(dp[row]));
        }

        return dp[2][n];
    }
    
    
    static int count2(String str){
        int a = 0, ab = 0, abc = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a') a = 2 * a + 1;
            if(str.charAt(i) == 'b') ab = 2 * ab + a;
            if(str.charAt(i) == 'c') abc = 2 * abc + ab;
        }

        return abc;
    }
}
