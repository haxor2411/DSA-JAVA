package Pattern;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pattern 5 Arrow
        int n =sc.nextInt();
        int stc = 1;
        for(int i = 1;i <= n; i++){
            int spc = i == (n+1)/2 ? 0 : n/2;
            for(int k = 1;k <= spc; k++){
                System.out.print("\t");
            }
            int lstc = i == (n+1)/2 ? n/2 : 0;
            for(int l = 1; l <= lstc ; l++){
                System.out.print("*\t");
            }
            for(int j = 1; j <= stc; j++){
                System.out.print("*\t");
            }
            if(i <= n/2){
                stc++;
            }
            else{
                stc--;
            }
            System.out.println();
        }
    }
}
