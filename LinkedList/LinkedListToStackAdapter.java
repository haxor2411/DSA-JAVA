package LinkedList;

import java.util.LinkedList;

public class LinkedListToStackAdapter {
    // public static class Node{
    //     int data;
    //     Node next;

    //     Node(int val){
    //         this.data = val;
    //         this.next = null;
    //     }
    // }
    //Combination of addfirst, removeFirst and getFirst
    public static class Stack{
        LinkedList<Integer> list;
        // Node head, tail;
        // int size;

        Stack(){list = new LinkedList<>();}

        int size(){return list.size();}

        void push(int val){
            // Node node = new Node(val);
            // if(this.size() == 0) this.head = this.tail = node;
            // else{
            //     node.next = this.head;
            //     this.head = node;
            // }
            // this.size++;

            list.addFirst(val);
        }

        int pop(){
            if(list.size() == 0) return -1;
            // Node tmp = this.head.next;
            // int val = this.head.data;
            // this.head.next = null;
            // this.head = tmp;

            // this.size--;
            // return val;

            return list.removeFirst();
        }

        int peek(){return list.getFirst();}
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println(stack.size());
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
        System.out.println(stack.peek());
        
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());

        System.out.println(stack.pop());
    }
}
