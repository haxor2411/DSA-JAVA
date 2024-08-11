package TimeAndSpace;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {7,-2,4,1,3,4,1};
        int[] res = countSort(arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] countSort(int[] arr){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        //finding min and max value to decide the size of the prefixCount array
        for(int i : arr){
            min = min > i ? i : min;
            max = max < i ? i : max;
        }
        //System.out.println(min + " " + max);

        //counting freq of each element
        int[] prefixCount = new int[max - min + 1];
        int N = prefixCount.length;
        for(int i = 0; i < n; i++){
            int pos = arr[i] - min;
            prefixCount[pos] += 1; 
        }
        //System.out.println(Arrays.toString(prefixCount));

        //creating a prefix aaray bu adding it's previous vlue into itself
        for(int i = 1; i < N; i++){
            prefixCount[i] += prefixCount[i - 1];
        }
        //System.out.println(Arrays.toString(prefixCount));
        
        int[] res = new int[n];
        for(int i = n - 1; i >= 0; i--){ //we traverse in right to left for stable sort to fill in the same manner
            int pos = arr[i] - min;
            res[prefixCount[pos] - 1] = arr[i]; //prefixCount contains place so we take place - 1 to determine index
            prefixCount[pos] -= 1; //deacresing the elem by 1 when it is put in res array
        }

        return res;
    }
}
