package Numerical;

import java.util.Scanner;

public class palindrome {
    //palindrome
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(palindrome(n));
    }
    public static boolean palindrome(int n){
        int cpy = n;
        int reverse = 0;
        while(cpy > 0){
            int rem = cpy % 10;
            reverse = reverse * 10 + rem;
            cpy = cpy / 10;
        }
        if(n == reverse){
            return true;
        }
        return false;
    }
}
