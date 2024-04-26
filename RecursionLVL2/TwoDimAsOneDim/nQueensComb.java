package RecursionLVL2.TwoDimAsOneDim;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class nQueensComb{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printComb(new boolean[n][n], 0, n, -1);
    }
    public static boolean isQueenSafe(boolean[][] chess, int row, int col){
        for(int i = row - 1, j = col; i >= 0; i--){
            if(chess[i][j] == true){
                return false;
            }
        }
        for(int i = row, j = col - 1; j >= 0; j--){
            if(chess[i][j] == true){
                return false;
            }
        }
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] == true){
                return false;
            }
        }
        for(int i = row - 1, j = col + 1; i >= 0 && j < chess[0].length; i--, j++){
            if(chess[i][j] == true){
                return false;
            }
        }
        return true;
    }
    public static void printComb(boolean[][] chess, int QueenPlaced, int totalQueens, int last_cell){
        if(QueenPlaced == totalQueens){
            for(int row = 0; row < chess.length; row++){
                for(int col = 0; col < chess[0].length; col++){
                    if(chess[row][col]){
                        System.out.print("q\t");
                    }
                    else{
                        System.out.print("-\t");
                    }
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int cell = last_cell + 1; cell < totalQueens * totalQueens; cell++){
            int row = cell / totalQueens;
            int col = cell % totalQueens;
            if(chess[row][col] == false && isQueenSafe(chess, row, col)){
                chess[row][col] = true;
                printComb(chess, QueenPlaced + 1, totalQueens, (row * totalQueens) + col);
                chess[row][col] = false;
            }
        }
    }
}