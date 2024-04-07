package TwoDimensionalArray;

import java.util.Scanner;

public class RotatebyRightAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nsq = sc.nextInt(); // rows = columns in square matrix
        int mat[][] = new int[nsq][nsq];
        for(int row = 0; row < nsq; row++){
            for(int col = 0; col < nsq; col++){
                mat[row][col] = sc.nextInt();
            }
        }
        transpose(mat);
        reverseRowWise(mat);
        display(mat);
    }
    public static void transpose(int mat[][]){
        for(int row = 0; row < mat.length; row++){
            for(int col = row + 1; col < mat[0].length; col++){
                int temp = mat[row][col];
                mat[row][col] = mat[col][row];
                mat[col][row] = temp;
            }
        }
    }
    public static void reverseRowWise(int mat[][]){
        int ncol = mat[0].length;
        for(int row = 0; row < ncol; row++){
            int cmin = 0, cmax = ncol - 1;
            while(cmin <= cmax){
                int temp = mat[row][cmax];
                mat[row][cmax] = mat[row][cmin];
                mat[row][cmin] = temp;
                cmin++;
                cmax--;
            }
        }
    }
    public static void display(int mat[][]){
        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[0].length; col++){
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }
    }
}
