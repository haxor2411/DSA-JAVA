package Numerical;
import java.util.Scanner;
public class fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 0;i < num;i++){
            System.out.println(a);
            c = a + b;
            a = b;
            b = c; 
        }
        sc.close();
    }
}
