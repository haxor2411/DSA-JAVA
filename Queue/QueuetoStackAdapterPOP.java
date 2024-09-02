package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

//POP - pop efficient
public class QueuetoStackAdapterPOP {
    public static class Stack{
        Queue<Integer> mainQ;
        Queue<Integer> helperQ;

        Stack(){
            mainQ = new ArrayDeque<>();
            helperQ = new ArrayDeque<>();
        }

        void push(int val){
            if(mainQ.isEmpty()) mainQ.add(val);
            else{
                helperQ.add(val);
                while(!mainQ.isEmpty()) helperQ.add(mainQ.remove());
                Queue<Integer> tmp = mainQ;
                mainQ = helperQ;
                helperQ = tmp;
            }
        }

        int pop(){
            if(mainQ.isEmpty()) return -1;
            return mainQ.remove();
        }

        int peek(){
            if(mainQ.isEmpty()) return -1;
            return mainQ.peek();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
