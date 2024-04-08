package RecursionArray;

import java.util.Scanner;

public class FirstandLastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx < n; idx++){
            arr[idx] = sc.nextInt();
        }
        int value = sc.nextInt();
        System.out.println(firstIndex(arr, value, 0) + " " + lastIndex(arr, value, 0/*,arr.length - 1 */));
    }
    public static int firstIndex(int arr[], int value, int idx){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == value){
            return idx;
        }
        else{
            return firstIndex(arr, value, idx + 1);
        }
        
    }
    // public static int lastIndex(int arr[], int value, int idx){
    //     if(idx == -1){
    //         return -1;
    //     }
    //     if(arr[idx] == value){
    //         return idx;
    //     }
    //     else{
    //         return lastIndex(arr, value, idx - 1);
    //     }
    // }

    //OR
    
    public static int lastIndex(int arr[], int value, int idx){
        if(idx == arr.length){
            return -1;
        }
        int result = lastIndex(arr, value, idx + 1);
        if(result == -1){
            if(arr[idx] == value){
                return idx;
            }
            else{
                return -1;
            }
        }
        return result;
    }
}
