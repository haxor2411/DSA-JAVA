package DynamicProgramming;
//Longest increasing subsequence
import java.util.Arrays;

public class LIS {
    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};
        int n = arr.length;
        System.out.println(maxLength(arr, n));
    }

    static int maxLength(int[] arr, int n){
        int maxLen = 1;
        int[] dp = new int[n];
        for(int i = 0; i < n; i++) dp[i] = 1;

        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = maxLen < dp[i] ? dp[i] : maxLen;
        }
        System.out.println(Arrays.toString(dp));
        return maxLen;
    }
}
