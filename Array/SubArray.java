package Array;
import java.util.*;
public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int idx = 0;idx < n;idx++){
            arr[idx] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                for(int idx = i; idx <= j; idx++){
                    System.out.print(arr[idx] + "\t");
                }
                System.out.println();
            }
        }
        // for finding subarray for fix size
        // int subarray_size = sc. nextInt();
        // for(int i = 0; i < n; i++){
        //     if(i + subarray_size  <= n){
        //         for(int j = i; j < i + subarray_size; j++){
        //             System.out.print(arr[j] + "\t");
        //         }
        //         System.out.println();
        //     }
        // }
    }
}
