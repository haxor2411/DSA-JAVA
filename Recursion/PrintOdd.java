package Recursion;

import java.util.Scanner;

public class PrintOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printOdd(n);
    }
    public static void printOdd(int n){
        // if(n == 0){
        //     return;
        // }
        // printOdd(n - 1);
        // if(n % 2 != 0){
        //     System.out.println(n);
        // }

        //better approach

        if(n <= 0){
            return;
        }
        if(n % 2 == 0){
            printOdd(n - 1);
        }
        else{
            printOdd(n - 2);
            System.out.println(n);
        }
    }
}
