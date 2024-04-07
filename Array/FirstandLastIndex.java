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
        int fidx = firstIndex(arr, val);
        int lidx = lastIndex(arr, val);
        System.out.println(fidx + "\n" + lidx);
    }
    //func to find first occurence of the elemennt in the array
    public static int firstIndex(int arr[], int val){
        int low = 0;
        int high = arr.length - 1;
        int fidx = -1; // index for finding first occurence
        while(low <= high){ // binary search
            int mid = (low + high) / 2;
            if(val == arr[mid]){
                fidx = mid;
                high = mid - 1; // start searching element in the left side of the array
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
    // func to find the last index
    public static int lastIndex(int arr[], int val){
        int low = 0;
        int high = arr.length - 1;
        int lidx = -1; // index for last occurence
        while(low <= high){
            int mid = (low + high) / 2;
            if(val == arr[mid]){
                lidx = mid;
                low = mid + 1; // start searching for the last index in the right side of the array
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
