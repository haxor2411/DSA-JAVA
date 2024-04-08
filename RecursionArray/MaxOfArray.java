package RecursionArray;

import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx < n; idx++){
            arr[idx] = sc.nextInt();
        }
        System.out.println(maxOfArray(arr, 0));
    }
    public static int maxOfArray(int arr[], int idx){
        // if(idx == arr.length){
        //     return max;
        // }
        // if(max < arr[idx]){
        //     max = arr[idx];
        //     return maxOfArray(arr, idx + 1, max);
        // }
        // return max;


        //OR

        
        if(idx == arr.length){
            return Integer.MIN_VALUE;
        }
        int result = maxOfArray(arr, idx + 1);
        if(result > arr[idx]){
            return result;
        }
        else{
            return arr[idx];
        }
    }
}
