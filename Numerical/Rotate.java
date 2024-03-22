package Numerical;

import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //{{Rotate a number}}
        int n = sc.nextInt();
        int r = sc.nextInt();
        int temp = n;
        int count =0;
        while(temp>0){
            temp = temp/10;
            count++;
        }
        r = r % count;
        if(r < 0){
            r = r + count;
        }
        int temp1 = n;
        int rightPart = temp1 % (int)Math.pow(10,r);
        int leftPart = temp1/(int)Math.pow(10,r);
        int rotatedNumber = rightPart*(int)Math.pow(10,count-r)+leftPart;
        System.out.println(rotatedNumber);
    }
}
