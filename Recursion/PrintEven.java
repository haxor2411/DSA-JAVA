package Recursion;

import java.util.Scanner;

public class PrintEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printEven(n);
    }
    public static void printEven(int n){
        if(n < 0){
            return;
        }
        if(n % 2 == 0){
            System.out.println(n);
            printEven(n - 2);
        }
        else{
            printEven(n - 1);
        }
    }
}
