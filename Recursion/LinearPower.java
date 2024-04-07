package Recursion;

import java.util.Scanner;

public class LinearPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();
        System.out.println(powerLinear(base, power));
    }
    public static int powerLinear(int base , int power){
        if(power == 0){
            return 1;   
        }
        return base * powerLinear(base, power - 1);
    }
}
