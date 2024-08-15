package DynamicProgramming;

import java.util.Arrays;

public class CoinChangePermutation {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6};
        int target = 7;
        changePerm(arr, target);
    }

    static void changePerm(int[] arr, int target){
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int i = 1; i <= target; i++){
            for(int j : arr) if(j <= i) dp[i] += dp[i - j];
        }
        System.out.println(Arrays.toString(dp));
        //ans at dp[target + 1]
    }
}
