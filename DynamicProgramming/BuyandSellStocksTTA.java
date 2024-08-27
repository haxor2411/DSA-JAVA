package DynamicProgramming;

import java.util.Arrays;

//TTA - two transactions allowed
public class BuyandSellStocksTTA {
    public static void main(String[] args) {
        int[] arr = {11,6,7,19,4,1,6,18,4};
        System.out.println(maxprofit(arr, arr.length));
    }    

    static int maxprofit(int[] arr, int n){
        int[] sellingDay = new int[n];
        int[] buyingDay = new int[n];

        int minPrice = arr[0];
        sellingDay[0] = 0;
        for(int i = 1; i < n; i++){
            minPrice = minPrice > arr[i] ? arr[i] : minPrice;
            sellingDay[i] = arr[i] - minPrice;
        }
        //converting to cumulative max profit till date
        for(int i = 1; i < n; i++) sellingDay[i] = sellingDay[i] < sellingDay[i - 1] ? sellingDay[i - 1] : sellingDay[i];
        System.out.println(Arrays.toString(sellingDay));

        int maxPrice = arr[n - 1];
        for(int i = n - 1; i >= 0; i--){
            maxPrice = maxPrice < arr[i] ? arr[i] : maxPrice;
            buyingDay[i] = maxPrice - arr[i];
        }
        //coverting to cumulative max profit can be in future
        for(int i = n - 2; i >= 0; i--) buyingDay[i] = buyingDay[i] > buyingDay[i + 1] ? buyingDay[i] : buyingDay[i + 1];
        System.out.println(Arrays.toString(buyingDay));

        int maximumProfit = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) maximumProfit = maximumProfit < buyingDay[i] + sellingDay[i] ? buyingDay[i] + sellingDay[i] : maximumProfit;
        return maximumProfit;
    }
}
