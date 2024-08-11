package TimeAndSpace;

import java.util.Arrays;

public class Partition {
    public static void main(String[] args) {
        int[] arr = {7,-2,4,1,3};
        int pivot = 3;
        partition(arr, pivot);
        System.out.println(Arrays.toString(arr));
    }

    // Sort01 approach || Dutch National Flag Algo || O(n)
    static void partition(int[] arr, int pivot){
        int i = 0, j = 0;
        while(i < arr.length){
            if(arr[i] > pivot) i++;
            else{
                swap(arr, i , j);
                i++;
                j++;
            }
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
