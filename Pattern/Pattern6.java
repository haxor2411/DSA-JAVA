package Pattern;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pattern 6 
        int n = sc.nextInt();
        for(int r = 1;r <= n; r++){
            for(int c = 1; c <= n; c++){
                if( r == 1 || r == c || r+c == n+1){
                    System.out.print("*\t");
                }
                else if( r > (n+1)/2 && r+c > n+1 && r > c){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println("\t");
        }
    }
}
