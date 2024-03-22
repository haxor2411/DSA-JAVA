package Pattern;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Pattern2 
        int n = sc.nextInt();
        int spc = n/2;
        int stc = 1;
        for(int r = 1; r <= n; r++){
            for(int i = 1; i <= spc; i++){
                System.out.print("\t");
            }
            for(int j = 1;j <=stc; j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(r <= n/2){
                spc--;
                stc = stc + 2;
            }
            else{
                spc++;
                stc = stc - 2;
            }
        }

        // int n = sc.nextInt();
        // for(int r = 1;r <= n;r++){
        //     for(int c = 1;c <= n;c++){
        //         if((r+c) < ((n+3)/2)){
        //             System.out.print("\t");
        //         }
        //         else if((r+c) > ((3*n+1)/2)){
        //             System.out.print("\t");
        //         }
        //         else if((r-c) > ((n-1)/2)){
        //             System.out.print("\t");
        //         }
        //         else if((c-r) > ((n-1)/2)){
        //             System.out.print("\t");
        //         }
        //         else{
        //             System.out.print("*\t");
        //         }    
        //     }
        //     System.out.println();
        // }    
    }    
}
