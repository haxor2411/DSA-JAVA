package RecursionLVL2.TwoDimAsOneDim;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class nKnightsComb{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printKnightComb(0, n, new boolean[n][n], -1);
    }
    public static void printKnightComb(int KnightPlaced, int totalKnights, boolean[][] chess, int lastPos){
        if(KnightPlaced == totalKnights){
            for(int row = 0; row < chess.length; row++){
                for(int col = 0; col < chess[0].length; col++){
                    System.out.print(chess[row][col] ? "q\t" : "-\t");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int cell = lastPos + 1; cell < totalKnights * totalKnights; cell++){
            int row = cell / totalKnights;
            int col = cell % totalKnights;
            if(chess[row][col] == false && isKnightSafe(chess, row, col)){
                chess[row][col] = true;
                printKnightComb(KnightPlaced + 1, totalKnights, chess, (row * totalKnights) + col);
                chess[row][col] = false;
            }
        }
    }
    public static boolean isKnightSafe(boolean[][] chess, int row, int col){
        int[] rows = {-2, -2, -1, -1};
        int[] cols = {1, -1, 2, -2};
        for(int i = 0; i < 4; i++){
            int nr = row + rows[i]; 
            int nc = col + cols[i];
            if(isValid(nr, nc, chess) && chess[nr][nc]){
                return false;
            } 
        }
        return true;
    }

    public static boolean isValid(int row, int col, boolean[][]chess){
        if(row >= 0 && col >= 0 && row < chess.length && col < chess[0].length){
            return true;
        }
        return false;
    }    
}