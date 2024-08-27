package DynamicProgramming;

import java.util.Arrays;

public class JumpGame {
    public static boolean canJump2(int[] nums) {
        int n = nums.length;
        if(n == 1) return true;
        boolean[] dp = new boolean[n];
        for(int i = n - 1; i >= 0; i--){
            if(nums[i] == 0) continue;
            else{
                int maxJmp = nums[i];
                for(int j = 1; j <= maxJmp && i + j < n; j++){
                    dp[i] = (i + j == n - 1) ? true : dp[i] || dp[i + j];
                }
            }
        }

        return dp[0];
    }

    public static boolean canJump(int[] nums){
        int n = nums.length;
        if(n == 1) return true;
        nums[n - 1] = 1;
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] == 0) continue;
            else{
                int maxJump = nums[i];
                for(int jmp = 1; jmp <= maxJump && i + jmp < n; jmp++){
                    if(i + jmp == n - 1) nums[i] = 1;
                    else if(nums[i + jmp] == 1) {
                        nums[i] = 1;
                        break;
                    }
                    else nums[i] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums[0] != 0;
    }

    public static void main(String[] args) {
        // int[] arr = {13055,19141,12848,11888,1185,9905,3984,14772,18935,6844,9851,13695,17955,16359,14969,6200,13436,16940,13893,1639,3233,11861,13475,11963,8193,3413,10952,8585,13807,6320,4507,1743,454,7983,9677,8348,2496,4585,11022,9103,1096,6770,6745,4350,2334,13024,2738,9444,1028,5337,2446,272,5799,7397,15000,4848,16772,12860,11773,196,3187,14016,1314,1684,19858,2598,16111,10577,1643,12252,5835,2819,17898,18210,799,5010,19937,1285,9693,18155,484,9184,7212,3474,14630,18418,10108,1735,3940,2877,18007,14731,10133,10470,15396,7464,6936,261};
        // int[] arr = {3,2,1,0,4};
        int[] arr = {2,5,0,0};
        System.out.println(canJump2(arr));
        System.out.println(canJump(arr));
    }
}
