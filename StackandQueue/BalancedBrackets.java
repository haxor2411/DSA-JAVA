package StackandQueue;
import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.nextLine();
        sc.close();
        System.out.println(isBalanaced(expr));
    }

    public static boolean isBalanaced(String expr){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < expr.length(); i++){
            char ch = expr.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else if(ch == ')' || ch == '}' || ch == ']'){
                if(st.size() == 0){
                    //nCB > nOB
                    return false;
                }
                if(ch == ')' && st.peek() != '('){
                    return false;
                }
                if(ch == '}' && st.peek() != '{'){
                    return false;
                }
                if(ch == ']' && st.peek() != '['){
                    return false;
                }
                st.pop();
            }
        }
        if(st.size() > 0){
            //nOB > nCB
            return false;
        }
        return true;
    }
}
