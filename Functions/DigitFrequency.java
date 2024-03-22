package Functions;

import java.util.Scanner;

public class DigitFrequency {
    // getdigitfrequency
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int f = getdigitfrequency(n, d);
        System.out.println(f);
    }
    public static int getdigitfrequency(int n, int d){
        int count = 0;
        while( n > 0){
            int r = n % 10;
            if(r == d){
            count++;
            }
            n = n / 10;
        }
        return count;
    }
}
