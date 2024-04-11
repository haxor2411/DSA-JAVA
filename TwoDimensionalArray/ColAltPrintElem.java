package TwoDimensionalArray;

import java.util.Scanner;

public class ColAltPrintElem  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nrows = sc.nextInt();
        int ncol = sc.nextInt();
        int arr[][] = new int[nrows][ncol];
        for(int row = 0; row < nrows; row++){
            for(int col = 0; col < ncol; col++){
                arr[row][col] = sc.nextInt();
            }
        }
        printAlternateElements(arr);
    }
    public static void printAlternateElements(int arr[][]){
        int ncol = arr[0].length;
        int col = 0;
        while(col < ncol){
            if(col % 2 == 0){
                for(int rowElem = 0; rowElem < arr.length; rowElem++){
                    System.out.println(arr[rowElem][col]);
                }
            }
            else{
                for(int rowElem = arr.length - 1; rowElem >= 0; rowElem--){
                    System.out.println(arr[rowElem][col]);
                }
            }
            col++;
        }
    }
}
