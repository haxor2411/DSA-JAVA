package TimeAndSpace;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7,-2,4,1,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            for(int j = i; j > 0; j--){
                if(arr[j] < arr[j - 1]) swap(arr, j, j - 1);
                else break;
            }
        }
    } 

    static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
