package Numerical;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //{{Reverse of a number}}
        int n = sc.nextInt();
        int reverseNumber = 0;
        while(n > 0){
            int r = n % 10;
            reverseNumber = reverseNumber * 10 + r;
            n = n / 10;
        }
        System.out.println(reverseNumber);
    }
}
