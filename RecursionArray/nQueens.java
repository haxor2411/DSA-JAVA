package RecursionArray;

import java.util.Scanner;

public class nQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNqueens(new int[n][n], "", 0);
    }
    public static boolean isSafe(int [][] chess, int row, int col){
        for(int i = row - 1, j = col ; i >= 0; i--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        for(int i = row - 1, j = col + 1; i >=0 && j < chess.length; i--, j++){
            if(chess[i][j] == 1){
                return false;
            }
        }
        for(int i = row - 1, j = col - 1; i >=0 && j >= 0; i--, j--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        return true;
    }
    public static void printNqueens(int[][] chess, String pos, int row){
        if(row == chess.length){
            System.out.println(pos + ".");
            return;
        }
        for(int col = 0; col < chess.length; col++){
            if(isSafe(chess, row, col)){
                chess[row][col] = 1;
                printNqueens(chess, pos + row + "-" + col + ", ", row + 1);
                chess[row][col] = 0;
            }
        }
    }
}
