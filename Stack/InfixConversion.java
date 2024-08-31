package Stack;

import java.util.Stack;

public class InfixConversion {
    public static void main(String[] args) {
        String s = "a*(b-c+d)/e";
        conversion(s);
    }

    static void conversion(String s){
        Stack<String> postfix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(') operator.push(ch);
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(!operator.isEmpty() && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek())) eval(postfix, prefix, operator.pop());
                operator.push(ch);
            }
            else if(ch == ')'){
                while(operator.peek() != '(') eval(postfix, prefix, operator.pop());
                operator.pop();
            }
            else{
                postfix.push(ch + "");
                prefix.push(ch + "");
            }
        }

        while(!operator.isEmpty()) eval(postfix, prefix, operator.pop());

        System.out.println(prefix.pop());
        System.out.println(postfix.pop());
    }

    static int precedence(char ch){
        if(ch == '+' || ch == '-') return 1;
        return 2;
    }

    static void eval(Stack<String> postfix, Stack<String> prefix, char op){
        String prefix2 = prefix.pop();
        String prefix1 = prefix.pop();
        prefix.push(op + prefix1 + prefix2);

        String postfix2 = postfix.pop();
        String postfix1 = postfix.pop();
        postfix.push(postfix1 + postfix2 + op);
    }
}
