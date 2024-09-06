package LinkedList;

public class KthNodeFromLast {
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

        int kthNode(int idx){
            if(idx < 0 || idx >= this.size()) return -1;
            Node curr = this.head, fwd = this.head;

            for(int i = 0; i < idx; i++) fwd = fwd.next;

            while(fwd != this.tail){
                curr = curr.next;
                fwd = fwd.next;
            }

            return curr.data;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        int val = 2;

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);

        list.display();

        System.out.println(list.kthNode(val));
    }
}