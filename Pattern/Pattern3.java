package Pattern;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spc = n/2;
        int stc = 1;
        int rst = 1;
        for(int r = 1;r <= n;r++){
            for(int i = 0; i < spc; i++){
                System.out.print(" \t");
            }
            int value = rst;
            for(int j = 0;j < stc; j++){
                System.out.print(value+"\t");
                if(j < stc/2){
                    value++;
                }
                else{
                    value--;
                }
            }

            if(r <= n/2){
                spc--;
                stc = stc + 2;
                rst++;
            }
            else{
                spc++;
                stc = stc - 2;
                rst--;
            }
            System.out.println();
        }   
    }
}
