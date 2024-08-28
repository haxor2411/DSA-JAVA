package Stack;

import java.util.Stack;

public class PostfixEval {
    public static void main(String[] args) {
        String s = "264*8/+3-";
        eval(s);
    }

    static void eval(String s){
        
        Stack<Integer> stackEval = new Stack<>();
        Stack<String> stackInfix = new Stack<>();
        Stack<String> stackPrefix = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '*' || c == '/' || c == '+' || c == '-'){
                
                String infix2 =stackInfix.pop();
                String infix1 =stackInfix.pop();
                
                String prefix2 = stackPrefix.pop();
                String prefix1 = stackPrefix.pop();

                stackInfix.push("("+infix1+c+infix2+")");
                stackPrefix.push(c+prefix1+prefix2);

                int v2 = stackEval.pop();
                int v1 = stackEval.pop();

                if(c == '*') stackEval.push(v1 * v2);
                else if(c == '+') stackEval.push(v1 + v2);
                else if(c == '/') stackEval.push(v1 / v2);
                else if(c == '-') stackEval.push(v1 - v2);
            }
            else{
                stackEval.push(Integer.parseInt(c + ""));
                stackInfix.push(c + "");
                stackPrefix.push(c + "");
            }
        }
        
        System.out.println("Eval: "+stackEval.peek());
        System.out.println("Infix: "+stackInfix.peek());
        System.out.println("Prefix: "+stackPrefix.peek());
    }
}
