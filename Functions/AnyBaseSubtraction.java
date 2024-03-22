package Functions;

import java.util.Scanner;

public class AnyBaseSubtraction {
    //any base subtraction
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int b = sc.nextInt();
        int res = anyBaseSubtract(n1, n2, b);
        System.out.println(res);
    }
    public static int anyBaseSubtract(int n1, int n2, int b){
        int borrow = 0;
        int res = 0;
        int pow = 1;
        while(n2 > 0){
            int r1 = n1 % 10;
            int r2 = n2 % 10;
            int subtract = r2 - r1 - borrow;
            if(subtract < 0){
                subtract += b;
                borrow = 1;
            }else{
                borrow = 0;
            }
            res += subtract * pow;
            pow = pow * 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
        }
        return res;
    }
}
