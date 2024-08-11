package TimeAndSpace;

import java.util.Arrays;

public class SortDates {
    public static void main(String[] args) {
        int[] arr = {12041996, 20101996, 5061997, 12041989, 11081987};
        sortDates(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortDates(int[] arr){
        int n = arr.length;
        countSortDate(arr, n);
        countSortMonth(arr, n);
        countSortYear(arr, n);
    }

    static void countSortDate(int[] arr, int n){
        int[] freq = new int[32];
        for(int i : arr) freq[i / 1000000]++;
        for(int i = 1; i < 32; i++) freq[i] += freq[i - 1];
        
        int[] res = new int[n];
        for(int i = n - 1; i >= 0; i--){
            int pos = arr[i] / 1000000;
            res[freq[pos] - 1] = arr[i];
            freq[pos]--;
        }

        for(int i = 0; i < n; i++){
            arr[i] = res[i];
        }
    }

    static void countSortMonth(int[] arr, int n){
        int[] freq = new int[13];
        for(int i : arr) freq[i / 10000 % 100]++;
        for(int i = 1; i < 13; i++) freq[i] += freq[i - 1];
        
        int[] res = new int[n];
        for(int i = n - 1; i >= 0; i--){
            int pos = arr[i] / 10000 % 100;
            res[freq[pos] - 1] = arr[i];
            freq[pos]--;
        }

        for(int i = 0; i < n; i++){
            arr[i] = res[i];
        }

    }

    static void countSortYear(int[] arr, int n){
        int[] freq = new int[10000];
        for(int i : arr) freq[i % 10000]++;
        for(int i = 1; i < 10000; i++) freq[i] += freq[i - 1];
        
        int[] res = new int[n];
        for(int i = n - 1; i >= 0; i--){
            int pos = arr[i] % 10000;
            res[freq[pos] - 1] = arr[i];
            freq[pos]--;
        }

        for(int i = 0; i < n; i++){
            arr[i] = res[i];
        }
    }
}
