package Functions;

import java.util.Scanner;

public class DecimalToAnyBase {
    // decimal to any
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int res = getValueInBase(n, b);
        System.out.println(res);
    }
    public static int getValueInBase(int n, int b){
        int res = 0;
        int pow = 1;
        while(n > 0){
            int rem = n % b;
            res += rem * pow;
            pow = pow * 10 ;
            n = n / b;
        }
    return res;
    }

}
