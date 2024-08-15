package DynamicProgramming;

import java.util.Arrays;

public class FractionalKnapSack {
    public static void main(String[] args) {
        int n = 10;
        int value[] = {33,14,50,9,8,11,6,40,2,15};
        int weight[] = {7,2,5,9,3,2,1,10,3,3};
        int target = 5;
        System.out.println(fractionalKnapsack(weight, value, n, target));
    }

    static double fractionalKnapsack(int[] weight, int[] value, int n, int target){
        Item[] items = new Item[n];
        for(int i = 0; i < n; i++){
            items[i] = new Item();
            items[i].value = value[i];
            items[i].weight = weight[i];
            items[i].ValWeighRatio = value[i] * (1.0) / weight[i];
        }

        Arrays.sort(items);

        int idx = 0;
        double tVal = 0.0;
        while(target > 0 && idx < n){
            if(items[idx].weight <= target) {
                target -= items[idx].weight;
                tVal += items[idx].value;
                idx++;
            }
            else{
                tVal += target * items[idx].ValWeighRatio;
                target = 0;
            }
        }
        return tVal;
    }

    static class Item implements Comparable<Item>{
        int value, weight;
        double ValWeighRatio;

        @Override
        public int compareTo(Item other) {
            if(other.ValWeighRatio < this.ValWeighRatio) return -1;
            else if(other.ValWeighRatio == this.ValWeighRatio) return 0;
            else return 1;
        }
    }
}
