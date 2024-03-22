package Array;

import java.util.Scanner;

public class FindSpan {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int idx = 0; idx < len; idx++){
            arr[idx] = sc.nextInt();
        }
        int res_span = getSpan(arr);
        System.out.println(res_span);
    }
    public static int getSpan(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int value : arr){
            if(value > max){
                max = value;
            }
            if(min > value){
                min = value;
            }
        }
        return max-min;
    }
}
