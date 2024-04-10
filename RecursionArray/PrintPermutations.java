package RecursionArray;

import java.util.Scanner;

public class PrintPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printPermutations(str, ""); 
    }
    public static void printPermutations(String str, String perm){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int idx = 0; idx < str.length(); idx++){
            char ch = str.charAt(idx);
            printPermutations(str.substring(0, idx) + str.substring(idx + 1), perm + ch);
        }
    }
}
