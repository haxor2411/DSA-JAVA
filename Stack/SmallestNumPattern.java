package Stack;

import java.util.Stack;

public class SmallestNumPattern {
    public static void main(String[] args) {
        String pattern = "ddddiiii";
        System.out.println(number(pattern));
    }

    static String number(String s){
        String ans = "";
        Stack<Integer> stack = new Stack<>();
        int i = 1;
        stack.push(1);

        for(char c : s.toCharArray()){
            if(c == 'd') stack.push(++i);
            else{
                while(!stack.isEmpty()) ans += stack.pop();
                stack.push(++i);
            }
        }
        while(!stack.isEmpty()) ans += stack.pop();

        return ans;
    }
}
