package DynamicProgramming;
//OTA - one transaction allowed
public class BuyandSellStocksOTA {
    public static void main(String[] args) {
        int days = 9;
        int price[] = {11,6,7,19,4,1,6,18,4};
        System.out.println(maxProfit(days, price));
    }

    static int maxProfit(int n, int[] arr){
        int maxProfit = 0, minPrice = arr[0];

        for(int i = 1; i < n; i++){
            minPrice = minPrice > arr[i] ? arr[i] : minPrice;
            maxProfit = maxProfit < arr[i] - minPrice ? arr[i] - minPrice: maxProfit;
        }
        return maxProfit;
    }
}
