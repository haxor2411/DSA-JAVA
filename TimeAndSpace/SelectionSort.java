package TimeAndSpace;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7,-2,4,1,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int minIdx = i;
            for(int j = i + 1; j < n; j++){
                minIdx = arr[j] < arr[minIdx] ? j : minIdx;
            }
            if(minIdx != i) swap(arr, i, minIdx);
        }
    }

    static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
