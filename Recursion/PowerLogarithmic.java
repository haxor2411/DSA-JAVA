package Recursion;

import java.util.Scanner;

public class PowerLogarithmic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();
        System.out.println(powerLogarithmic(base, power));
    }
    public static int powerLogarithmic(int base, int power){
        // if(power == 0){
        //     return 1;
        // }
        // if(power % 2 == 0){
        //     return powerLogarithmic(base, power / 2) * powerLogarithmic(base, power / 2);
        // }
        // else{
        //     return base * powerLogarithmic(base, power / 2) * powerLogarithmic(base, power / 2);
        // }

        //OR better

        if(power == 0){
            return 1;
        }
        int Pow = powerLogarithmic(base, power / 2);
        int RealPow = Pow * Pow;
        if(power % 2 == 1){

            RealPow *= base;
        }
        return RealPow;

    }
}
