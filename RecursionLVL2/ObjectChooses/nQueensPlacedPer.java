package RecursionLVL2.ObjectChooses;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class nQueensPlacedPer {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printPermQueenChooses(1, n, new int[n][n]);
    }
    public static void printPermQueenChooses(int QueensPlaced, int TotalQueens, int[][] chess){
        if(QueensPlaced > TotalQueens){
            for(int row = 0; row < chess.length; row++){
                for(int col = 0; col < chess[0].length; col++){
                    System.out.print(chess[row][col] != 0 ? "q" + chess[row][col] + "\t": "-\t");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int row = 0; row < chess.length; row++){
            for(int col = 0; col < chess[0].length; col++){
                if(chess[row][col] == 0){
                    chess[row][col] = QueensPlaced; // Place a queen in this cell
                    printPermQueenChooses(QueensPlaced + 1, TotalQueens, chess);
                    chess[row][col] = 0; // Remove the queen from this cell
                }
            }
        }
    }
}

