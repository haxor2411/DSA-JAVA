package Array;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,75,85,95,120,150,180};
        int x = 95;
        System.out.println(binarySearch(arr, x));
    }
    public static int binarySearch(int arr[], int x){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == x){
                return mid;
            }
            else if(x > arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
