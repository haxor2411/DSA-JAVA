package LinkedList;

public class RemoveDuplicatesinSorted {
    public static class Node{
        int data;
        Node next;

        Node(){}
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

        void removeDuplicates(){
            LinkedList list = new LinkedList();
            Node tmp = this.head;
            while(tmp != null){
                if(list.head == null || list.tail.data != tmp.data) list.addLast(tmp.data);
                tmp = tmp.next;
            }

            list.display();
        }

        void removeDuplicates2(){
            if(this.head == null) return;

            Node curr = this.head;
            while(curr.next != null){
                if(curr.data == curr.next.data) curr.next = curr.next.next;
                else curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(2);
        list.addLast(2);
        list.addLast(3);
        list.addLast(3);
        list.addLast(3);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);

        list.display();

        // list.removeDuplicates();
        list.removeDuplicates2();
        list.display();
    }
}
