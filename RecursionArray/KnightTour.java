package RecursionArray;

import java.util.Scanner;

public class KnightTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int srow = sc.nextInt();
        int scol = sc.nextInt();
        printKnightTour(new int[n][n], 1, srow, scol);
    }
    public static void printKnightTour(int[][] chess, int str, int sr, int sc){
        if(sr < 0 || sc < 0 || sr >= chess.length || sc >= chess.length || chess[sr][sc] != 0){
            return;
        }
        chess[sr][sc] = str;
        if(str == chess.length *  chess.length){
            displayboard(chess);
            chess[sr][sc] = 0;
            return;
        }
        printKnightTour(chess, str + 1, sr - 2, sc + 1);
        printKnightTour(chess, str + 1, sr - 1, sc + 2);
        printKnightTour(chess, str + 1, sr + 1, sc + 2);
        printKnightTour(chess, str + 1, sr + 2, sc + 1);
        printKnightTour(chess, str + 1, sr + 2, sc - 1);
        printKnightTour(chess, str + 1, sr + 1, sc - 2);
        printKnightTour(chess, str + 1, sr - 1, sc - 2);
        printKnightTour(chess, str + 1, sr - 2, sc - 1);
        chess[sr][sc] = 0;
    }
    public static void  displayboard(int[][] board){
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board.length; col++){
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
