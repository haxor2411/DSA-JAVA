package Stack;

import java.util.Stack;

public class StackIntro {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);

        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.size());

        System.out.println(stack.isEmpty());
    }
}
