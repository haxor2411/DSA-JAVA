package Recursion;

import java.util.Scanner;

public class TowerofHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int source = sc.nextInt();
        int dest = sc.nextInt();
        int helper = sc.nextInt();

        toh(source, dest, helper, n);
    }
    public static void toh(int source, int dest, int helper, int n){
        if(n == 0){
            return;
        }
        toh(source, helper,dest, n - 1);
        System.out.println(n + "[" + source + " -> " + dest + "]");
        toh(helper, dest, source, n - 1);
    }
}
