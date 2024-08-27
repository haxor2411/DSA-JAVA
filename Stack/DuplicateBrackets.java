package Stack;

import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        // String input = "((a+b)+(c+d))";
        String input = "(a+b)+((c+d))";
        System.out.println(duplicateBrackets(input));
    }

    static boolean duplicateBrackets(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c != ')') stack.push(c);
            else if(c == ')') {
                if(stack.peek() == '(') return true;
                else{
                    while(stack.peek() != '(') stack.pop();
                    stack.pop(); // for open bracket
                }
            }
            System.out.println(stack);   //for debugging 
        }
        return false;
    }
}
