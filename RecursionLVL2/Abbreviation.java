package RecursionLVL2;

import java.util.Scanner;

public class Abbreviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solution(str, "", 0, 0);
    }
    public static void solution(String str, String ans, int count, int pos){
        if(pos == str.length()){
            if(count != 0){
                System.out.println(ans+count);
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        char ch = str.charAt(pos);
        if(count == 0){
            solution(str, ans + ch, 0, pos + 1);
        }
        else{
            solution(str, ans + count + ch, 0, pos + 1);
        }
        solution(str, ans, count + 1, pos + 1);
    }
}

