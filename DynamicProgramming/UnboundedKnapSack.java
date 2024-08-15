package DynamicProgramming;



public class UnboundedKnapSack {
    public static void main(String[] args) {
        int n = 5;
        int value[] = {15,14,10,45,30};
        int weight[] = {2,5,1,3,4};
        int target = 7;
        System.out.println(unboundedKnapsack(value, weight, n, target));
    }

    static int unboundedKnapsack(int[] value, int[] weight, int n, int target){
        int[] dp = new int[target + 1];

        for(int i = 0; i < n; i++){
            for(int j = weight[i]; j <= target; j++){
                dp[j] = Math.max(dp[j], value[i] + dp[j - weight[i]]);
            }
            //System.out.println(Arrays.toString(dp));
        }
        return dp[target];
    }
}
