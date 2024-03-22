package Numerical;

import java.util.Scanner;

public class Armstrong {
    //armstrong
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(armstrong(n));
    }
    public static int armstrong(int n){
        int count = 0;
        int cpy = n;
        int ans = 0;
        while(cpy > 0){
            cpy = cpy / 10;
            count++;
        }
        while(n > 0){
            int r = n % 10;
            ans = ans + (int)Math.pow(r, count);
            n = n / 10;
        }
        return ans;
    }
}
