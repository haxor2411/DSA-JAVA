package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
    // to find nth fibonacci number
    public static int fibonacci(int n){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
