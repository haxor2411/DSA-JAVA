package RecursionLVL2.ObjectChooses;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class nQueensPlacedCom {
    public static void main(String[] args) throws Exception{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printComQueenChooses(1, n, new int[n][n], -1, -1);
    }
    public static void printComQueenChooses(int QueensPlaced, int TotalQueens, int[][] chess, int LastRow, int LastCol){
        if(QueensPlaced > TotalQueens){
            for(int row = 0; row < chess.length; row++){
                for(int col = 0; col < chess[0].length; col++){
                    System.out.print(chess[row][col] != 0 ? "q\t" : "-\t");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int row = LastRow + 1; row < chess.length; row++){
            for(int col = LastCol + 1; col < chess[0].length; col++){
                if(chess[row][col] == 0){
                    chess[row][col] = 1;
                    if(col < chess[0].length - 1){
                        LastRow = row - 1;
                        LastCol = col;
                    }
                    else{
                        LastCol = -1;
                        LastRow = row;
                    }
                    printComQueenChooses(QueensPlaced + 1,TotalQueens, chess, LastRow, LastCol);
                    chess[row][col] = 0;
                }        
            }
        }
    }
}