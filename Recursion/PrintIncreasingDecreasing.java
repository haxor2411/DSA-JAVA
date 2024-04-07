package Recursion;

import java.util.Scanner;

public class PrintIncreasingDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasingDecreasing(n);
    }
    public static void printIncreasingDecreasing(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printIncreasingDecreasing(n - 1);
        System.out.println(n);
    }
}
