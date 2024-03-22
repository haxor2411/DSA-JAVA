package Numerical;

import java.util.Scanner;

public class PrimeFactorisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //PrimeFactorisation
        int n = sc.nextInt();
        for(int i = 2;i <= n;i++){
            if(n%i == 0){
                boolean flag = true;
                for(int j = 2;j*j <= i;j++){
                    if(i%j ==0){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.println(i);
                }
            }
        }
    }
}
