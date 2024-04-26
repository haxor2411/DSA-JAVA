package RecursionLVL2.TwoDimAsOneDim;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class nQueensPerm {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printPerm(new int[n][n], 0, n);
    }
    public static void printPerm(int[][]chess, int QueenPlaced, int totalQueens){
        if(QueenPlaced == totalQueens){
            for(int row = 0; row < chess.length; row++){
                for(int col = 0; col < chess[0].length; col++){
                    if(chess[row][col] != 0){
                        System.out.print("q" + chess[row][col] + "\t");
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
        for(int cell = 0; cell < totalQueens * totalQueens; cell++){
            int row = cell / totalQueens;
            int col = cell % totalQueens;
            if(chess[row][col] == 0 && isQueenSafe(chess, row, col)){
                chess[row][col] = QueenPlaced + 1;
                printPerm(chess, QueenPlaced + 1, totalQueens);
                chess[row][col] = 0;
            }
        }
    }
    public static boolean isQueenSafe(int[][]chess, int row, int col){
        for(int i = row - 1, j = col; i >= 0; i--){
            if(chess[i][j] != 0){
                return false;
            }
        }
        for(int i = row, j = col - 1; j >= 0; j--){
            if(chess[i][j] != 0){
                return false;
            }
        }
        for(int i = row, j = col + 1; j < chess[0].length; j++){
            if(chess[i][j] != 0){
                return false;
            }
        }
        for(int i = row + 1, j = col; i < chess.length; i++){
            if(chess[i][j] != 0){
                return false;
            }
        }
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] != 0){
                return false;
            }
        }
        for(int i = row + 1, j = col + 1; i < chess.length && j < chess[0].length; i++, j++){
            if(chess[i][j] != 0){
                return false;
            }
        }
        for(int i = row - 1, j = col + 1; i >= 0 && j < chess[0].length; i--, j++){
            if(chess[i][j] != 0){
                return false;
            }
        }
        for(int i = row + 1, j = col - 1; i < chess.length && j >= 0; i++, j--){
            if(chess[i][j] != 0){
                return false;
            }
        }
        return true;
    }
}
