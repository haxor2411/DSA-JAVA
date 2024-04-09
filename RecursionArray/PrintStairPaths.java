package RecursionArray;

import java.util.Scanner;

public class PrintStairPaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStairPath(n, "");
    }
    public static void printStairPath(int n, String asf){
        if(n == 0){
            System.out.println(asf);
            return;
        }
        // if(n < 0){
        //     return;
        // }
        // printStairPath(n - 1, asf + "1");
        // printStairPath(n - 2, asf + "2");
        // printStairPath(n - 3, asf + "3");

        if(n - 1 >= 0){
            printStairPath(n - 1, asf + "1");
        }
        if(n - 2 >= 0){
            printStairPath(n - 2, asf + "2");
        }
        if(n - 3 >= 0){
            printStairPath(n - 3, asf + "3");
        }
    }
}
