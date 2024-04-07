package Array;

import java.util.Scanner;

public class CeilFloor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx < n; idx++){
            arr[idx] = sc.nextInt();
        }
        int val = sc.nextInt();
        binarySearch(arr, val);
    }

    public static void binarySearch(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;
        int ceil = -1, floor = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                floor = ceil = arr[mid];
                break;
            }
            else if (x > arr[mid]) {
                low = mid + 1;
                floor = arr[mid];
            } else if(x < arr[mid]){
                high = mid - 1;
                ceil = arr[mid];
            }
        }
        System.out.println(ceil + "\n" + floor);
    }
}
