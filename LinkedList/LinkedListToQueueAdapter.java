package LinkedList;

import java.util.LinkedList;

public class LinkedListToQueueAdapter {
    public static class Queue{
        LinkedList<Integer> list;

        Queue(){list = new LinkedList<>();}

        int size(){return list.size();}

        void add(int val){list.addLast(val);}

        int remove(){
            if(list.size() == 0) return -1;
            return list.removeFirst();
        }

        int peek(){
            if(list.size() == 0) return -1;
            return list.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);

        System.out.println(queue.size());
        System.out.println(queue.peek());
        
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.size());
        System.out.println(queue.peek());
    }
}
