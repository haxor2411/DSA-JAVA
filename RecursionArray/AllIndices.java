package RecursionArray;

import java.util.Scanner;

public class AllIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx < n; idx++){
            arr[idx] = sc.nextInt();
        }
        int value = sc.nextInt();
        int res[] = findAllIndices(arr, 0, value, 0); //fsf = frequency so far
        for(int val : res){
            System.out.print(val + " ");
        }
    }
    public static int[] findAllIndices(int arr[], int idx, int value, int fsf){
        if(idx == arr.length){
            int res[] = new int[fsf];
            return res;
        }
        if(arr[idx] == value){
            int[] res = findAllIndices(arr, idx + 1, value, fsf + 1); 
            res[fsf] = idx;
            return res;
        }
        else{
            return findAllIndices(arr, idx + 1, value, fsf);
        }
    }
}
