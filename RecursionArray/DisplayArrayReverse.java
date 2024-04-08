package RecursionArray;

import java.util.Scanner;

public class DisplayArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx < n; idx++){
            arr[idx] = sc.nextInt();
        }
        int rev_idx = sc.nextInt();
        displayArrayReverse(arr, rev_idx);
    }
    public static void displayArrayReverse(int arr[], int rev_idx){
        if(rev_idx == arr.length){
            return;
        }
        displayArrayReverse(arr, rev_idx + 1);
        System.out.println(arr[rev_idx]);
    }
}
