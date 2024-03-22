package Pattern;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Pascal Triangle
        int n = sc.nextInt();
        for(int i =0;i < n; i++){
            int value = 1;
            for(int j = 0;j <= i;j++){
                System.out.print(value+"\t");
                value = value * (i-j)/(j+1);
            }
            System.out.println();
        }
    }
    
}
