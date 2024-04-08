package RecursionArray;

import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx < n; idx++){
            arr[idx] = sc.nextInt();
        }
        int idx = sc.nextInt();
        displayArray(arr, idx);
    }
    public static void displayArray(int arr[], int idx){
        if(idx == arr.length){
            return;
        }
        System.out.println(arr[idx]);
        displayArray(arr, idx + 1);
    }
}
