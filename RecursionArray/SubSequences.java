package RecursionArray;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> list = generateSubsequences(str);
        System.out.println(list);
    }
    public static ArrayList<String> generateSubsequences(String str){
        if(str == ""){
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        char ch = str.charAt(0);
        String roq = str.substring(1);
        ArrayList<String> subSeq = generateSubsequences(roq);
        ArrayList<String> mySubSeq = new ArrayList<>();
        for(String s : subSeq){
            mySubSeq.add(s);
        }
        for(String s : subSeq){
            mySubSeq.add(ch + s);
        }
        return mySubSeq;
    }
}
