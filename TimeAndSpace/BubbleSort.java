package TimeAndSpace;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,-2,4,1,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // static void bubbleSort(int[] arr){
    //     int n = arr.length;
    //     for(int i = 1; i <= n - 1; i++){
    //         for(int j = 0; j <= n - i - 1; j++){
    //             if(arr[j] > arr[j + 1]) swap(arr, j, j + 1);
    //         }
    //     }
    // }

    //You can go either way both are same

    static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = n - 1; i >= 0; i--){
            for(int j = 1; j <= i; j++){
                if(arr[j - 1] > arr[j]) swap(arr, j - 1, j);
            }
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
