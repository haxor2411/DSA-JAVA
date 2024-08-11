package TimeAndSpace;

import java.util.Arrays;

public class Sort01 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1,1,1,0,1,1};
        // sort1(arr);
        sort2(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort1(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            if(arr[left] == 1){
                if(arr[left] == arr[right]) right--;
                else{
                    swap(arr, left, right);
                    right--;
                    left++;
                }
            }
            else left++;
        }
    }

    static void sort2(int[] arr){
        int i = 0;
        int j = 0;
        while(i < arr.length){
            if(arr[i] == 1){
                i++;
            }
            else{
                swap(arr, i, j);
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
