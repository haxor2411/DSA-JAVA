package Recursion;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFibonacci(0, 1, n);
    }
    public static void printFibonacci(int a, int b, int n){
        System.out.print(a + " ");
        int c = a + b;
        a = b;
        b = c;
        if(c > n){
            return;
        }
        printFibonacci(a, b, n);
    }
}
