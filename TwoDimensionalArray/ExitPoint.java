package TwoDimensionalArray;

import java.util.Scanner;

public class ExitPoint {
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
        exitPoint(mat);
    }
    public static void exitPoint(int mat[][]){
        int row = 0, col = 0, dir = 0, prevRow = -1, prevCol = -1;
        while(row >= 0 && col >= 0 && row < mat.length && col < mat[0].length){
            prevRow = row;
            prevCol = col;
            dir = (dir + mat[row][col]) % 4;
            if(dir == 0){
                col++;
            }
            else if(dir == 1){
                row++;
            }
            else if(dir == 2){
                col--;
            }
            else if(dir == 3){
                row--;
            }
        } 
        System.out.println(prevRow + " " + prevCol);
    } 
}
