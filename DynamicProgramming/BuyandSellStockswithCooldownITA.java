package DynamicProgramming;

import java.util.Arrays;

//ITA - infinite transaction allowed
public class BuyandSellStockswithCooldownITA {
    public static void main(String[] args) {
        int days = 12;
        int prices[] = { 10, 15, 17, 20, 16, 18, 22, 20, 22, 20, 23, 25 };
        System.out.println(maxProfit(prices, days));
        System.out.println(maxProfit2(prices, days));
    }

    static int maxProfit(int[] arr, int n){
        int[][] dp = new int[n][3];
        dp[0][0] = -arr[0];

        for(int row = 1; row < n; row++){
            int coolState = dp[row - 1][2];
            int buyState = Math.max(dp[row - 1][0], -arr[row] + coolState);
            int sellState = Math.max(dp[row - 1][1], arr[row] + dp[row - 1][0]);

            dp[row][0] = buyState;
            dp[row][1] = sellState;
            dp[row][2] = dp[row - 1][1]; //oSellState
        }
        for(int row = 0; row < n; row++) System.out.println(Arrays.toString(dp[row]));
        return dp[n - 1][1];
    }  
    
    
    static int maxProfit2(int[] arr, int n){
        int oBuyState = -arr[0], oSellState = 0, oCoolState = 0;

        for(int row = 1; row < n; row++){
            int nBuyState = Math.max(oBuyState, oCoolState - arr[row]);
            int nSellState = Math.max(oSellState, arr[row] + oBuyState);
            int nCoolState = oSellState;

            oBuyState = nBuyState;
            oSellState = nSellState;
            oCoolState = nCoolState;
        }
        return oSellState;
    }
}
