package Stack;

import java.util.Stack;

public class PrefixEval {
    public static void main(String[] args) {
        String s = "-+2/*6483";
        prefix(s);
    }

    static void prefix(String s){
        Stack<Integer> stackEval = new Stack<>();
        Stack<String> stackInfix = new Stack<>();
        Stack<String> stackPostfix = new Stack<>();

        int n = s.length();
        for(int i = n - 1; i >= 0; i--){
            char ch = s.charAt(i);
            if(ch == '+' || ch == '*' || ch == '/' || ch == '-'){
                String infix1 = stackInfix.pop();
                String infix2 = stackInfix.pop();
                stackInfix.push("("+infix1+ch+infix2+")");

                String postfix1 = stackPostfix.pop();
                String postfix2 = stackPostfix.pop();
                stackPostfix.push(postfix1+postfix2+ch);

                int v1 = stackEval.pop();
                int v2 = stackEval.pop();
                if(ch == '+') stackEval.push(v1+v2);
                else if(ch == '*') stackEval.push(v1*v2);
                else if(ch == '-') stackEval.push(v1-v2);
                else if(ch == '/') stackEval.push(v1/v2);
            }
            else{
                stackEval.push(Integer.parseInt(ch + ""));
                stackInfix.push(ch + "");
                stackPostfix.push(ch + "");
            }
        }

        System.out.println(stackEval.peek());
        System.out.println(stackInfix.peek());
        System.out.println(stackPostfix.peek());
    }
}
