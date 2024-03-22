package Pattern;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pattern4
        int rows = sc.nextInt();
        int spc = (rows-2)*2+1;
        int stc = 1;
        for(int r = 1; r<= rows; r++){
            int lv = 1;
            for(int i = 1; i <= r; i++){
                System.out.print(lv+"\t");
                lv++;
            }
            for(int i = 1; i <= spc; i++){
                System.out.print("\t");
            }   
            int rcnt = r == rows ? r-1 : r;
            int rv = rcnt;
            for(int i = 1; i <= rcnt; i++){
                System.out.print(rv+"\t");
                rv--;
            }
            spc = spc - 2;
            System.out.println();
        }
    }
}
