package AutoDesk;
import java.util.Scanner;

public class longestDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nrow = sc.nextInt();
        int ncol = sc.nextInt();
        int[][] matrix = new int[nrow][ncol];
        for(int row = 0; row < nrow; row++){
            for(int col = 0; col < ncol; col++){
                matrix[row][col] = sc.nextInt();
            }
        }
        int best = longestDiagonalLength(matrix);
        System.out.println(best);
    }
    public static int  longestDiagonalLength(int[][] matrix){
        int[][] directions = {{1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
        int maxlen = 0;
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                if(matrix[row][col] == 1){
                    for(int[] dir : directions){
                        int cnt_len = 1;
                        int next_row = row + dir[0];
                        int next_col = col + dir[1];
                        while(next_col >= 0 && next_row >= 0 && next_col < matrix[0].length && next_row < matrix.length && matrix[next_row][next_col] != 1){
                            cnt_len++;
                            next_row += dir[0];
                            next_col += dir[1];
                        }
                        maxlen = Math.max(maxlen, cnt_len);
                    }
                }
            }
        }
        return maxlen;
    }
}
