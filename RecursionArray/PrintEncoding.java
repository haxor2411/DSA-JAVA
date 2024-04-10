package RecursionArray;

import java.util.Scanner;

public class PrintEncoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printEncoding(str, "");
    }
    public static void printEncoding(String str, String encode){
        if(str.length() == 0){
            System.out.println(encode);
            return;
        }
        if(str.length() < 0){
            return;
        }
        //myApproach
        // char ch = (char) (Integer.parseInt(str.charAt(0) + "") + 96);
        // printEncoding(str.substring(1), encode + ch);
        // if(str.length() >= 2){
        //     if(Integer.parseInt(str.substring(0,2) + "") <= 26){
        //         char ch1 = (char) (Integer.parseInt(str.substring(0, 2) + "") + 96);
        //         printEncoding(str.substring(2), encode + ch1);
        //     }
        // }

        //OR

        char firstChar = str.charAt(0);
        int num1 = Integer.parseInt(firstChar + "");
        printEncoding(str.substring(1), encode + (char) ('a' + num1 - 1));

        if(str.length() > 1){
            char secondChar = str.charAt(1);
            int num2 = Integer.parseInt("" + firstChar + secondChar);
            if(num2 >=10 && num2 <= 26){
                printEncoding(str.substring(2), encode + (char) ('a' + num2 - 1));
            }
        }
    }
}
