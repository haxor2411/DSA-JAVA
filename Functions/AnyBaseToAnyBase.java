package Functions;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    // any to any base
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int res = getValueInBase(getValueDecimal(n, b1), b2);
        System.out.println(res);
    }
    public static int getValueInBase(int n, int b) {
        int res = 0;
        int pow = 1;
        while (n > 0) {
            int rem = n % b;
            res += rem * pow;
            pow = pow * 10;
            n = n / b;
        }
    return res;
    }
    public static int getValueDecimal(int n, int b) {
        int res = 0;
        int pos = 0;
        while (n > 0) {
            int rem = n % 10;
            res += rem * (int) Math.pow(b, pos);
            pos++;
            n = n / 10;
        }
    return res;
    }
}
