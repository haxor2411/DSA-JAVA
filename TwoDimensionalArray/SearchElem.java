package TwoDimensionalArray;

import java.util.Scanner;



public class SearchElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nrow = sc.nextInt();
        int ncol = sc.nextInt();
        int mat[][] = new int[nrow][ncol];
        for(int row = 0; row < nrow; row++){
            for(int col = 0; col < ncol; col++){
                mat[row][col] = sc.nextInt();
            }
        }
        int value = sc.nextInt();
        findElem(mat, value);
    }
    public static void findElem(int mat[][], int value){
        int row = 0;
        int col = mat[0].length - 1;
        while(row < mat.length && col >= 0){
            if(value == mat[row][col]){
                System.out.println(row + " " + col);
                return;
            }
            else if(value <  mat[row][col]){
                col--;
            }
            else if(value > mat[row][col]){
                row++;
            }
        }
        System.out.println("Not Found");
    }
}
