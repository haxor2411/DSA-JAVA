package Array;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 75, 85, 95, 120, 150, 180 };
        int x = 120;
        System.out.println(binarySearch(arr, 0, arr.length - 1, x));
    }

    public static int binarySearch(int arr[], int low, int high, int x) {
        if (low <= high) {
            int mid = low + (high - low) / 2; // avoid overflow
            if (arr[mid] == x) {
                return mid;
            }
            if (x > arr[mid]) {
                 return binarySearch(arr, mid + 1, high, x); // right part 
            } 
            else {
                return binarySearch(arr, low, mid - 1, x); // left part
            }
        }
        return -1;
    }

}
