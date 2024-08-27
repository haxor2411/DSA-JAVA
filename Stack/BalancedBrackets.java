package Stack;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String input = "[(a+b)+{(c+d)*(e/f)}]"; //true
        // String input = "[(a+b)+{(c+d)*(e/f)]}"; //false
        System.out.println(isBalanced(input));
        System.out.println("______________");
        System.out.println(isBalanced2(input));
        System.out.println(isBalanced("]"));
        System.out.println(isBalanced2("(]"));
    }

    static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        int nOB = 0, nCB = 0;
        for(char c : s.toCharArray()){
            System.out.println(stack);
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
                nOB++;
            }
            else if(c == ')' || c == '}' || c == ']'){
                nCB++;
                if(nCB > nOB) return false;
                if(c == ')' && stack.peek() == '(') stack.pop();
                else if(c == '}' && stack.peek() == '{') stack.pop();
                else if(c == ']' && stack.peek() == '[') stack.pop();
            }
        }
        return stack.isEmpty() && nOB == nCB;
    }

    // Better approach
    static boolean isBalanced2(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            System.out.println(stack);
            if(c == '(' || c == '{' || c == '[') stack.push(c);
            else if(c == ')' || c == '}' || c == ']'){
                if(stack.isEmpty()) return false; // nCB > nOB;

                if(c == ')' && stack.peek() != '(') return false;
                else if(c == '}' && stack.peek() != '{') return false;
                else if(c == ']' && stack.peek() != '[') return false;

                stack.pop();
            }
        }

        return stack.isEmpty(); // nOB > nCB || nCB == nOB
    }
}
