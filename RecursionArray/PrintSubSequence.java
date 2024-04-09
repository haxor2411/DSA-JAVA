package RecursionArray;

import java.util.Scanner;

public class PrintSubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printSubSequence(str, "");
    }
    public static void printSubSequence(String str, String asf){
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        char ch = str.charAt(0);
        String roq = str.substring(1);
        printSubSequence(roq, asf);
        printSubSequence(roq, asf + ch);
    }
}
