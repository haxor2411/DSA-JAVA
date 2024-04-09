package RecursionArray;

import java.util.Scanner;

public class PrintKPC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printKPC(str, "");
    }
    static String[] keyPad = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKPC(String str, String asf){
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        String roq = str.substring(1);
        String word = keyPad[Integer.parseInt(str.charAt(0) + "")];
        for(int idx = 0; idx < word.length(); idx++){
            printKPC(roq, asf + word.charAt(idx));
        }

    }
}
