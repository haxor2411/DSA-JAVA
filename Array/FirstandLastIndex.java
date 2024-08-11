package Array;
import java.util.*;
public class FirstandLastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int idx = 0;idx < n; idx++){
            arr[idx] = sc.nextInt();
        }
        int val = sc.nextInt();
        sc.close();
        int fidx = firstIndex(arr, val);
        int lidx = lastIndex(arr, val);

        int freq = lidx - fidx + 1;
        System.out.println(freq);
    }
    
    public static int firstIndex(int arr[], int val){
        int low = 0;
        int high = arr.length - 1;
        int fidx = -1; 
        while(low <= high){ 
            int mid = (low + high) / 2;
            if(val == arr[mid]){
                fidx = mid;
                high = mid - 1; 
            }
            else if(val < arr[mid]){
                high = mid - 1;
            }
            else if(val > arr[mid]){
                low = mid + 1;
            }
        }
        return fidx;
    }

    public static int lastIndex(int arr[], int val){
        int low = 0;
        int high = arr.length - 1;
        int lidx = -1; 
        while(low <= high){
            int mid = (low + high) / 2;
            if(val == arr[mid]){
                lidx = mid;
                low = mid + 1; 
            }
            else if(val < arr[mid]){
                high = mid - 1;
            }
            else if(val > arr[mid]){
                low = mid + 1;
            }
        }
        return lidx;
    }
}
