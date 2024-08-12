package TimeAndSpace;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,7,1,3,8,2,9,13,-10,0,12};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high){
        if(low > high) return;
        int pivot = arr[high];
        int pidx = partition(arr, pivot, low, high);
        quickSort(arr, low, pidx - 1);
        quickSort(arr, pidx + 1, high);
    }

    static int partition(int[] arr, int pivot, int low, int high){
        int i = low, j = low;
        while(i <= high){
            if(arr[i] > pivot) i++;
            else{
                swap(arr, i , j);
                i++;
                j++;
            }
        }
        return j - 1;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
