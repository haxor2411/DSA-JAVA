package RecursionLVL2.TwoDimAsOneDim;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QueensChoosesComb {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // printComb(1, n, new int[n * n], -1);
        printComb(0, n, new boolean[n][n], -1);
    }
    // public static void printComb(int current_Queen, int totalQueens, int[] arr,int lidx){
    //     if(current_Queen > totalQueens){
    //         for(int idx = 0; idx < arr.length; idx++){
    //             System.out.print(arr[idx] != 0 ? "q\t" : "-\t");
    //             if(totalQueens % (idx + 1) == 0){
    //                 System.out.println();
    //             }
    //         }
    //         System.out.println();
    //         return;
    //     }
    //     for(int idx = lidx + 1; idx < arr.length; idx++){
    //         if(arr[idx] == 0){
    //             arr[idx] = 1;
    //             printComb(current_Queen + 1, totalQueens, arr, idx);
    //             arr[idx] = 0;
    //         }
    //     }
    // }

    // 2nd Approach
    public static void printComb(int QueenPlaced, int totalQueens, boolean[][] chess, int last_cell_no){
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
        for(int cell = last_cell_no + 1; cell < totalQueens * totalQueens; cell++){
            int row = cell / totalQueens;
            int col = cell % totalQueens;
            chess[row][col] = true;
            printComb(QueenPlaced + 1, totalQueens, chess, cell);
            chess[row][col] = false;
        }
    }
}
