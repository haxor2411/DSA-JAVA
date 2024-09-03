package Queue;

import java.util.Stack;

//Remove efficient
public class StacktoQueueAdapter {
    
    public static class Queue{
        Stack<Integer> mainS;
        Stack<Integer> helperS;

        Queue(){
            mainS = new Stack<>();
            helperS = new Stack<>();
        }

        int size(){return mainS.size();}

        void add(int val){
            while(!mainS.isEmpty()) helperS.push(mainS.pop());

            mainS.push(val);

            while(!helperS.isEmpty()) mainS.add(helperS.pop());
        }

        int remove(){
            if(mainS.size() == 0) return -1;
            return mainS.pop();
        }

        int peek(){
            if(mainS.size() == 0) return -1;
            return mainS.peek();
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

