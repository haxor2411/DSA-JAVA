package TwoDimensionalArray;

import java.util.Scanner;

public class SpiralDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        int nrows = sc.nextInt();
        int ncol = sc.nextInt();
        int mat[][] = new int[nrows][ncol];
        for(int row = 0; row < nrows; row++){
            for(int col = 0; col < ncol; col++){
                mat[row][col] = sc.nextInt();
            }
        }
        spiralDisplay(mat);
    }
    public static void spiralDisplay(int mat[][]){
        int rmin = 0, rmax = mat.length - 1, cmin = 0, cmax = mat[0].length - 1;
        int count = 0;
        int totalElem = mat.length * mat[0].length;
        while(count < totalElem){
            for(int i = rmin, j = cmin; i <= rmax && count < totalElem; i++){
                System.out.println(mat[i][j]);
                count++;
            }
            for(int i = rmax, j = cmin + 1; j <= cmax && count < totalElem; j++){
                System.out.println(mat[i][j]);
                count++;
            }
            for(int i = rmax - 1, j = cmax; i >= rmin && count < totalElem; i--){
                System.out.println(mat[i][j]);
                count++; 
            }
            for(int i = rmin, j = cmax - 1; j >= cmin + 1 && count < totalElem; j--){
                System.out.println(mat[i][j]);
                count++;
            }
            rmin++;
            cmin++;
            rmax--;
            cmax--;
        }
    }
}
