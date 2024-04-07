package Recursion;

import java.util.Scanner;

public class PrintZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printZigZagPattern(n);
    }
    public static void printZigZagPattern(int n){
        if(n == 1){
            System.out.print("111");
            return;
        }

        System.out.print(n);
        printZigZagPattern(n - 1);
        System.out.print(n);
        printZigZagPattern(n - 1);
        System.out.print(n);
    }
}
