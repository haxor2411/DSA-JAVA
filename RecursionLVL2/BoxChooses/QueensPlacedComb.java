package RecursionLVL2.BoxChooses;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QueensPlacedComb {
    public static void main(String[] args) throws Exception{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printQueensPosComb(0, n, "", 0, 0);
    }
    public static void printQueensPosComb(int QueensPlaced, int totalQueens, String  Pos, int row, int col){
        if(row == totalQueens){
            if(QueensPlaced == totalQueens){
                System.out.println(Pos);
                System.out.println();
            }
            return;
        }
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
        printQueensPosComb(QueensPlaced + 1, totalQueens, Pos + "q" + seperator, nr, nc);
        printQueensPosComb(QueensPlaced, totalQueens, Pos + "-" + seperator, nr, nc);
    }
}
