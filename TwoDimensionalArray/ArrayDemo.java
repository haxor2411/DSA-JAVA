package TwoDimensionalArray;
import java.util.*;
public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nrows = sc.nextInt();
        int ncol = sc.nextInt();
        int arr[][] = new int[nrows][ncol];  // Declare
        for(int row = 0; row < nrows; row++){
            for(int col = 0; col < ncol; col++){
                arr[row][col] = sc.nextInt();   // Assign values to array elements
            }
        }
        //output
        for(int row = 0; row < nrows; row++){
            for(int col = 0; col < ncol; col++){
                System.out.print(arr[row][col] + " "); 
            }
            System.out.println();
        }
    }
}
