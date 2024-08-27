package DynamicProgramming;

import java.util.Arrays;

//No Overlapping
//Fees Charged per transaction
//infinite transaction

public class BuyandSellStockFee {
    public static void main(String[] args) {
        int days = 12;
        int prices[] = { 10, 15, 17, 20, 16, 18, 22, 20, 22, 20, 23, 25 };
        int fee = 3;
        System.out.println(maxProfit(days, prices, fee));
        System.out.println(maxProfit2(prices, days, fee));
    }

    static int maxProfit(int n, int[] arr, int fee) {
        int[][] dp = new int[n][2];
        // Col - 0 -> BUY STATE
        // Col - 1 -> SELL STATE
        int profit = 0;
        dp[0][0] = -1 * arr[0];
        for (int row = 1; row < n; row++) {
            int sellState = dp[row - 1][1];
            int buyState = Math.max(dp[row - 1][0], -1 * (arr[row] - sellState));
            dp[row][0] = buyState;
            profit = Math.max(sellState, arr[row] + buyState - fee);
            dp[row][1] = profit;
        }
        for (int row = 0; row < n; row++) {
            System.out.println(Arrays.toString(dp[row]));
        }
        return dp[n - 1][1];
    }

    static int maxProfit2(int[] arr, int n, int fee) {
        int oBuyState = -arr[0], oSellState = 0;
        for (int row = 1; row < n; row++) {
            int nBuyState = Math.max(oBuyState, -arr[row] + oSellState);
            int nSellState = Math.max(oSellState, arr[row] + oBuyState - fee);

            oBuyState = nBuyState;
            oSellState = nSellState;
        }
        return oSellState;
    }
}
