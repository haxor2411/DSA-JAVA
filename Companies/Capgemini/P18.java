package Companies.Capgemini;

import java.util.Arrays;

//Rotate matrix by right angle;
public class P18 {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};

        int n = mat.length;

        transpose(mat, n);
        reverseRow(mat, n);

        for(int i = 0; i < n; i++) System.out.println(Arrays.toString(mat[i]));
    }

    static void transpose(int[][] mat, int n){
        for(int row = 0; row < n; row++){
            for(int col = row + 1; col < n; col++){
                int tmp = mat[row][col];
                mat[row][col] = mat[col][row];
                mat[col][row] = tmp;
            }
        }
    }


    static void reverseRow(int[][] mat, int n){
        for(int row = 0; row < n; row++){
            int cmin = 0, cmax = n - 1;
            while(cmin < cmax){
                int tmp = mat[row][cmin];
                mat[row][cmin] = mat[row][cmax];
                mat[row][cmax] = tmp;

                cmin++;
                cmax--;
            }
        }
    }
}
