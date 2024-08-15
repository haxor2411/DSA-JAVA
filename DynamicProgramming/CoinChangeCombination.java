package DynamicProgramming;

import java.util.Arrays;

public class CoinChangeCombination {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6};
        int target = 7;
        changeComb(arr, target);
    }

    static void changeComb(int[] arr, int target){
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int i : arr){
            for(int j = i; j <= target; j++) dp[j] += dp[j - i];
        }
        System.out.println(Arrays.toString(dp));
        // ans is at dp[target + 1];
    }
}
