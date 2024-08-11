package TimeAndSpace;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,2,1,0,0,0,1,1,1,2,2,2,0,0,1,0,1,0,1,2,2,1,1,0,0};
        System.out.println(arr.length);
        // sort1(arr);
        sort2(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort1(int[] arr){
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        for(int i : arr){
            if(i == 0) cnt0++;
            else if(i == 1) cnt1++;
            else cnt2++;
        }
        System.out.println(cnt0 + " " + cnt1 + " " + cnt2);
        for(int i = 0; i < cnt0; i++){
            arr[i] = 0;
        }
        for(int i = cnt0; i < cnt0 + cnt1; i++){
            arr[i] = 1;
        }
        for(int i = cnt0 + cnt1; i < arr.length; i++){
            arr[i] = 2;
        }
    }

    //Dutch National flag Algorithm
    static void sort2(int[] arr){
        int low = 0, mid = 0, high = arr.length  -1;
        while(mid <= high){
            if(arr[mid] == 1) mid++;
            else if(arr[mid] == 0){
                swap(arr, low,  mid);
                low++;
                mid++;
            }
            else{
                swap(arr, mid, high);
                high--;
            }
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
