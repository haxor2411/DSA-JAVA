package Functions;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int res = getValueDecimal(n, b);
        System.out.println(res);
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
