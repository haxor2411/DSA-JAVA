package Companies.Capgemini;
//Rotate array by k
import java.util.Arrays;

public class P17 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = -2;

        rotate(arr, k);
    }

    static void rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;

        if(k < 0) k = k + n;

        reverseArray(arr, 0, n - k - 1);
        reverseArray(arr, n - k, n - 1);
        reverseArray(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int[] arr, int start, int end){
        while(start < end){
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;

            start++;
            end--;
        }
    }
}
