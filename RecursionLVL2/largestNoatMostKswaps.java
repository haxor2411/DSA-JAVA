package RecursionLVL2;

import java.util.Scanner;

public class largestNoatMostKswaps {
    static String max;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        max = str;
        int n = sc.nextInt();
        findMaximum(str, n);
        System.out.println(max);
    }
    public static void findMaximum(String str, int n){
        if(n == 0){
            return;
        }

        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j < str.length(); j++){
                String nstr = swap(str, i, j);
                if(Integer.parseInt(nstr) > Integer.parseInt(max)){
                    max = str;
                }
                findMaximum(nstr, n - 1);
            }
            
        }
    }
    public static String swap(String str, int i, int j){
        StringBuilder sb = new StringBuilder(str);
        char iCh = sb.charAt(i);
        char jCh = sb.charAt(j);
        sb.setCharAt(i, jCh);
        sb.setCharAt(j, iCh);
        return sb.toString();
    }
}
