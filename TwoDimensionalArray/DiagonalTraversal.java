package TwoDimensionalArray;

import java.util.Scanner;

public class DiagonalTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                mat[row][col] = sc.nextInt();
            }
        }
        printDiagonal(mat);
    }
    public static void  printDiagonal(int mat[][]){
        int n = mat.length;
        for(int gap = 0; gap < n; gap++){
            for(int row = 0, col = gap; row < n && col < n; row++, col++ ){
                System.out.println(mat[row][col]);
            }
        }
    }
}
