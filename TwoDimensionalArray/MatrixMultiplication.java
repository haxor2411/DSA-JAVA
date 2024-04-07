package TwoDimensionalArray;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        int nr1 = sc.nextInt();
        int nc1 = sc.nextInt();
        int mat1[][] = new int[nr1][nc1];
        for(int row = 0; row < nr1; row++){
            for(int col = 0; col < nc1; col++){
                mat1[row][col] = sc.nextInt();
            }
        }
        int nr2 = sc.nextInt();
        int nc2 = sc.nextInt();
        int mat2[][] = new int[nr2][nc2];
        for(int row = 0; row < nr2; row++){
            for(int col = 0; col < nc2; col++){
                mat2[row][col] = sc.nextInt();
            }
        }
        matrixMultiplication(mat1, mat2);
    }
    public static void matrixMultiplication(int mat1[][], int mat2[][]){
        int nr1 = mat1.length;
        int nc1 = mat1[0].length;
        int nr2 = mat2.length;
        int nc2 = mat2[0].length;
        //main logic for matrix multiplication
        if(nc1 == nr2){
            int resMat[][] = new int[nr1][nc2];
            for(int row = 0; row < nr1; row++){
                for(int col = 0; col < nc2; col++){
                    for(int k = 0; k < nc1; k++){
                        resMat[row][col] = resMat[row][col] + (mat1[row][k] * mat2[k][col]);
                    }
                }        
            }
            //print output
            for(int row = 0; row < nr1; row++){
                for(int col = 0; col < nc2; col++){
                    System.out.print(resMat[row][col] + " "); 
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
