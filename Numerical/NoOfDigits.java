package Numerical;

import java.util.Scanner;

public class NoOfDigits {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        //{{ To count the number of digit in a number }}
        int num = sc.nextInt();
        int count = 0;
        while(num > 0){
            num = num/10;
            count++;
        }
        System.out.println(count);

        //{{ To print the digit of a number }}
        while(num > 0){
            int r  = num % 10;
            num = num / 10;
            System.out.println(r);
        }
    }    
}
