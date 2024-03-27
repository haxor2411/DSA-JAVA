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
        reverseSubArray(arr, 0, r-2);//first part of the array
        reverseSubArray(arr, r-1, n-1);//second part of the array 
        reverseSubArray(arr, 0, n-1); //whole array reversed
        for(int idx = 0; idx < n; idx++){
            System.out.println(arr[idx]);
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
