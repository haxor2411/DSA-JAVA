package RecursionLVL2;

import java.util.Scanner;

public class LexographicalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= 9; i++){
            solve(i, n);
        }
        sc.close();

    }
    public static void solve(int num, int n){
        if(num > n){
            return;
        }
        System.out.println(num);
        for(int digit = 0; digit <= 9; digit++){
            int newNum = (num * 10) + digit;
            if(newNum <= n){
                solve(newNum, n);
            }
        }
    }
}
