package Numerical;

import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Inverse of a number
        int n = sc.nextInt();
        int inverseNumber = 0;
        int index = 0;
        while(n > 0){
            index++;
            int r = n % 10;
            inverseNumber = inverseNumber + index*(int)Math.pow(10,r-1);
            n = n / 10;
        }
        System.out.println(inverseNumber);
    }
}
