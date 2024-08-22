package DynamicProgramming;

public class BuyandSellStocksInfiniteTrans {
    public static void main(String[] args) {
        int days = 14;
        int[] prices = {5,3,6,7,12,7,5,7,5,7,5,9,10,13};
        System.out.println(maxProfit(days, prices));
        System.out.println(maxProfit2(days, prices));
        System.out.println(maxProfit3(prices));
    }

    static int maxProfit(int n, int[] arr){
        int totalProfit = 0, minPrice = arr[0], maxPrice = 0;
        for(int i = 1; i < n; i++){
            if(maxPrice < arr[i] - minPrice) maxPrice = arr[i] - minPrice;
            else{
                totalProfit += maxPrice;
                maxPrice = 0;
                minPrice = arr[i];
            }
        }
        return totalProfit + maxPrice;
    }

    static int maxProfit2(int n, int[] arr){
        int bp = 0, sp = 0, profit = 0;

        for(int i = 1; i < n; i++){
            if(arr[i] >= arr[i - 1]) sp = i;
            else{
                profit += arr[sp] - arr[bp];
                bp = sp = i;
            }

        }
        return profit + arr[sp] - arr[bp];
    }

    static int maxProfit3(int[] arr){
        int cost = arr[0], max = 0;

        for(int n : arr){
            if(cost < n) max += n - cost;
            cost = n;
        }

        return max;
    }
}
