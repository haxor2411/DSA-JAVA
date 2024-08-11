package TimeAndSpace;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {1005, 236, 91, 386, 10, 7, 9, 224, 1111, 1670, 4580};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void radixSort(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i : arr) max = max < i ? i : max; //max value to find the no of digit in max value

        int iter = 0; //variable which decides how many times you have to perform count sort
        while(max > 0){
            iter++;
            max = max / 10;
        }
        // System.out.println(iter);

        int pow = 1;
        while(iter > 0){
            countSort(arr, pow);
            iter--;
            pow *= 10;
        }
    }

    static void countSort(int[] arr, int pow){
        int n = arr.length;
        int[] prefixCount = new int[10];
        for(int i : arr) prefixCount[(i / pow) % 10]++;
        for(int i = 1; i < 10; i++) prefixCount[i] += prefixCount[i - 1];

        int[] res = new int[n];
        for(int i = n - 1; i >= 0; i--){
            int pos = (arr[i] / pow) % 10; // find the place in the number to be sorted
            res[prefixCount[pos] - 1] = arr[i];
            prefixCount[pos]--;
        }

        for(int i = 0; i < n; i++){
            arr[i] = res[i];
        }
    }
}
