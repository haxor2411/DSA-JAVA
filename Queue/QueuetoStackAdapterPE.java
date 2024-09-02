package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

//PE - Push Efficient
public class QueuetoStackAdapterPE {
    public static class Stack{
        Queue<Integer> mainQ;
        Queue<Integer> HelperQ;

        Stack(){
            this.mainQ = new ArrayDeque<>();
            this.HelperQ = new ArrayDeque<>();
        }

        void push(int val){this.mainQ.add(val);};

        int pop(){
            while(this.mainQ.size() != 1) this.HelperQ.add(this.mainQ.remove());
            int val = this.mainQ.remove();

            Queue<Integer> tmp = this.mainQ;
            this.mainQ = this.HelperQ;
            this.HelperQ = tmp;

            return val;
        }

        int top(){
            if(this.size() == 0) return -1;
            while(this.mainQ.size() != 1) this.HelperQ.add(this.mainQ.remove());
            int val = this.mainQ.remove();
            this.HelperQ.add(val);

            Queue<Integer> tmp = this.mainQ;
            this.mainQ = this.HelperQ;
            this.HelperQ = tmp;

            return val;
        }

        int size(){return this.mainQ.size();};
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.top());
        System.out.println(stack.size());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.top());
        System.out.println(stack.size());
    }
}
