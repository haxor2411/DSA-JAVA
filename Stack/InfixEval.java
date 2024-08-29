package Stack;

import java.util.Stack;

public class InfixEval {
    public static void main(String[] args) {
        String s = "2+6*4/8-3";
        System.out.println(eval(s));
    }

    static int precedence(char op) {
        if(op == '+') return 1;
        if(op == '-') return 1;
        if(op == '*') return 2;
        return 2;
    }

    static void evaluation(Stack<Integer> operand, Stack<Character> operator) {
        char ch = operator.pop();
        int v2 = operand.pop();
        int v1 = operand.pop();

        if (ch == '+') operand.push(v1 + v2);
        else if (ch == '-') operand.push(v1 - v2);
        else if (ch == '/') operand.push(v1 / v2);
        else if (ch == '*') operand.push(v1 * v2);
    }

    static int eval(String s) {
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '*' || ch == '/' || ch == '+' || ch == '-') {
                while(!operator.isEmpty() && precedence(ch) <= precedence(operator.peek())) evaluation(operand, operator);
                operator.push(ch);
            } 
            else operand.push(Integer.parseInt(ch + ""));
        }
        while(!operator.isEmpty()) evaluation(operand, operator);
        return operand.peek();
    }
}
