package Pattern;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Pattern
        int n = sc.nextInt();
        int spc = 0;
        int stc = n;
        for(int r = 1; r <= n; r++){
            for(int j = 1;j <= spc; j++){
                System.out.print("\t");
            }
            for(int k = 1; k <= stc; k++){
                System.out.print("*\t");
                
            }
            System.out.println();
            spc++;
            stc--;
        }
        //OR
        int n2 = sc.nextInt();
        for(int r = 1;r <= n2; r++){
            for(int c = 1;c <= n2; c++){
                if(r <=c){
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
