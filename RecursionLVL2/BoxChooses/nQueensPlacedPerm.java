package RecursionLVL2.BoxChooses;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class nQueensPlacedPerm {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] queens = new boolean[n];
        printQueensPos(queens, n, 0, 0, 0, "");
    }
    public static void printQueensPos(boolean[] queens, int totalQueens, int QueenPlaced, int row, int col, String Pos){
        int nr, nc;
        String seperator = "";
        if(col < totalQueens - 1){
            nr = row;
            nc = col + 1;
            seperator = "\t";
        }
        else{
            nr = row + 1; 
            nc = 0;
            seperator = "\n";
        }
        if(nr == totalQueens){
            if(QueenPlaced == totalQueens){
                System.out.println(Pos);
                System.out.println();
            }
            return;
        }
        for(int idx = 0; idx < totalQueens; idx++){
            if(queens[idx] == false){
                queens[idx] = true;
                printQueensPos(queens, totalQueens, QueenPlaced + 1, nr, nc, Pos + "q" + (idx + 1) + seperator);
                queens[idx] = false;
            }
        }
        printQueensPos(queens, totalQueens, QueenPlaced, nr, nc, Pos + "-" + seperator);
    }
}
