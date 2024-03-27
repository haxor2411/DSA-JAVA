package Array;
import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx < n; idx++){
            arr[idx] = sc.nextInt();
        }
        int r = sc.nextInt();
        r = r % n;
        if(r < 0){
            r = r + n;
        }
        reverseSubArray(arr, 0, n-r-1);//first part of the array
        reverseSubArray(arr, n-r, n-1);//second part of the array 
        reverseSubArray(arr, 0, n-1); //whole array reversed
        for(int idx = 0; idx < n; idx++){
            System.out.print(arr[idx]);
        }
    }
    public static void reverseSubArray(int[] arr, int strt_idx, int end_idx){
        while(strt_idx < end_idx){
            int temp = arr[strt_idx];
            arr[strt_idx] = arr[end_idx];
            arr[end_idx] = temp;
            strt_idx++;
            end_idx--;
        }
    }
} 
