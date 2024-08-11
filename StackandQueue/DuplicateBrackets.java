package StackandQueue;
import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        System.out.println(isDuplicate(exp));
        sc.close();

    }

    public static boolean isDuplicate(String expr){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < expr.length(); i++){
            char ch = expr.charAt(i);
            if(ch == ')'){
                if(st.peek() == '('){
                    return true;
                }
                while(st.peek() != '('){
                    st.pop();
                }
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        return false;
    }
}
