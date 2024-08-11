package TimeAndSpace;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,7,13,8,2,9,13,-10,0,12};
        int n = arr.length;
        // int[] res = mergeSort(arr, 0, n - 1);
        // System.out.println(Arrays.toString(res));
        mergeSort2(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr, int low, int high){
        if(low == high) return new int[]{arr[low]};
        int mid = (low + high) / 2;
        int left[] = mergeSort(arr, low, mid);
        int right[] = mergeSort(arr, mid + 1, high);
        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right){
        int p1 = 0, p2 = 0, p3 = 0;
        int[] res = new int[left.length + right.length];
        while(p1 < left.length && p2 < right.length) res[p3++] = (left[p1] < right[p2]) ? left[p1++] : right[p2++];
        while(p1 < left.length) res[p3++] = left[p1++];
        while(p2 < right.length) res[p3++] = right[p2++];

        return res;
    }


    //2nd method

    static void mergeSort2(int[] arr, int low, int high){
        if(low == high) return;
        int mid = (low + high) / 2;
        mergeSort2(arr, low, mid);
        mergeSort2(arr, mid + 1, high);
        merge2(arr, low, mid, high);
    }

    static void merge2(int[] arr, int low, int mid, int high){
        int left = low;
        int right = mid + 1;
        int ptr = 0;
        int[] temp = new int[high - low + 1];
        while(left <= mid && right <= high) temp[ptr++] = (arr[left] < arr[right]) ? arr[left++] : arr[right++];
        while(left <= mid) temp[ptr++] = arr[left++];
        while(right <= high) temp[ptr++] = arr[right++];

        for(int i = low; i <= high; i++){
            arr[i] = temp[i - low];
        }
    }
}
