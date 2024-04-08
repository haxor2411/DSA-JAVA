package RecursionArray;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKPC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(getKPC(str));
    }

    static String[] keyPad = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKPC(String str){
        if(str.length() == 0){
            ArrayList<String> rres = new ArrayList<>();
            rres.add("");
            return rres;
        }
        String roq = str.substring(1);
        ArrayList<String> res = getKPC(roq);
        String word = keyPad[Integer.parseInt(str.charAt(0) + "")];
        ArrayList<String> list = new ArrayList<>();
        for(int idx = 0; idx < word.length(); idx++){
            for(String s : res){
                list.add(word.charAt(idx) + s);
            }
        }
        return list;
    }
}
