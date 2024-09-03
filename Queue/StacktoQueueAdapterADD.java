package Queue;

import java.util.Stack;

// Add efficient
public class StacktoQueueAdapterADD {
    public static class Queue{
        Stack<Integer> mainS;
        Stack<Integer> helperS;

        Queue(){
            this.mainS = new Stack<>();
            this.helperS = new Stack<>();
        }

        int size(){return this.mainS.size();}

        void add(int num){this.mainS.push(num);}
        
        int remove(){
            if(this.mainS.isEmpty()) return -1;
            while(this.mainS.size() != 1) this.helperS.push(this.mainS.pop());
            int val = this.mainS.pop();

            while(!this.helperS.isEmpty()) this.mainS.push(this.helperS.pop());
            return val;
        }

        int peek(){
            if(this.mainS.isEmpty()) return -1;
            while(this.mainS.size() != 1) this.helperS.push(this.mainS.pop());
            int val = this.mainS.peek();

            while(!this.helperS.isEmpty()) this.mainS.push(this.helperS.pop());
            return val;
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println(queue.size());
        System.out.println(queue.peek());
        
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.size());
        System.out.println(queue.peek());

        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
