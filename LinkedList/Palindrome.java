package LinkedList;

public class Palindrome {
    public static class Node{
        int data;
        Node next;

        Node(int val){
            this.data = val;
            this.next = null;
        }
    }

    public static class LinkedList{
        Node head, tail;
        int size;

        int size(){return this.size;}

        void addLast(int val){
            Node node = new Node(val);
            if(this.size() == 0) this.head = this.tail = node;
            else{
                this.tail.next = node;
                this.tail = node;
            }
            this.size++;
        }

        void display(){
            if(this.size() == 0){
                System.out.println("Empty");
                return;
            }
            Node tmp = this.head;
            while(tmp != null){
                System.out.print(tmp.data + " ");
                tmp = tmp.next;
            }
            System.out.println();
        }

        static Node left;
        static int flag;
        boolean palindrome(){
            flag = 0;
            left = this.head;
            helper(this.head, 0);
            return (flag == 0) ? true : false;
        }

        void helper(Node node, int idx){
            if(node == null) return;

            helper(node.next, idx + 1);

            Node right = node;
            if(idx > this.size() / 2){
                if(left.data != right.data) flag += 1;
                left = left.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(30);
        list.addLast(20);
        list.addLast(10);

        System.out.println(list.palindrome());
    }
}
