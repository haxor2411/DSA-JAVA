package Pattern;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pattern 7 
        int n = sc.nextInt();
        for(int r = 1; r <= n; r++){
            for(int c = 1; c <= n; c++){
                if(c == 1 || c == n){
                    System.out.print("*\t");
                }
                else if(r >= (n+1)/2 && (r == c || r+c == n+1)){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
