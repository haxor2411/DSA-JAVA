package Array;

import java.util.*;

public class barchart {
    public static void main(String[] args) {
        //input and max element
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int arr[] = new int[n];
        for (int idx = 0; idx < n; idx++) {
            arr[idx] = sc.nextInt();
            if(arr[idx] > max){
                max = arr[idx];
            }
        }
        //logic
        int nrow = max; //no of rows
        int ncol = n; //no of columns
        for(int row = nrow; row > 0; row--){ //row 7 - 1
            for(int idx_col = 0; idx_col < ncol; idx_col++){
                if(arr[idx_col] >= row){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println(); // row change 
        }
    }

}
