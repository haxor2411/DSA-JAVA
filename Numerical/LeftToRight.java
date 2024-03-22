package Numerical;

import java.util.Scanner;

public class LeftToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //{{ To print the digit left to right  }}
        //count the digits
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        while(temp > 0){
            temp = temp / 10;
            count++;
        }
        //calculate power var
        int pow = 1;
        int i = count - 1;
        while(i > 0){
            pow = pow * 10;
            i--;
        }
        //print digits
        while(pow > 0){
            int r = n / pow;
            n = n % pow;
            System.out.println(r);
            pow = pow / 10;
        }
    }
}
