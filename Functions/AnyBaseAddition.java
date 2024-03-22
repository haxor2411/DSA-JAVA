package Functions;

import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int b = sc.nextInt();
        int res = anyBaseAdd(n1, n2, b);
        System.out.println(res);
    }
    public static int anyBaseAdd(int n1, int n2, int b) {
        int res = 0;
        int pow = 1;
        int carry = 0;
        while (n1 > 0 || n2 > 0 || carry > 0) {
            int r1 = n1 % 10;
            int r2 = n2 % 10;
            int sum = carry + r1 + r2;
            int value = sum % b;
            carry = sum / b;
            res += value * pow;
            pow = pow * 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
        }
        return res;
    }
}
