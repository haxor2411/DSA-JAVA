package TimeAndSpace;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {-2,5,9,11};
        int[] arr2 = {4,6,8};
        merge(arr1, arr2);
    }

    static void merge(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

        int[] res = new int[m + n];

        int p1 = 0, p2 = 0, p3 = 0;

        while(p1 < n && p2 < m) res[p3++] = arr1[p1] < arr2[p2] ? arr1[p1++] : arr2[p2++];
        while(p1 < n) res[p3++] = arr1[p1++];
        while(p2 < m) res[p3++] = arr1[p2++];

        System.out.println(Arrays.toString(res));
    }
}
