package LinkedList;

public class MidElem {
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


        int midElem(){
            Node slow = this.head, fast = this.head;

            while(fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow.data;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);

        list.display();

        System.out.println(list.midElem());
    }
}
