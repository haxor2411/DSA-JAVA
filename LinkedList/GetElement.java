package LinkedList;

public class GetElement {
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

        int getFirst(){
            if(this.size() == 0) return -1;
            return this.head.data;
        }

        int getLast(){
            if(this.size() == 0) return -1;
            return this.tail.data;
        }

        int getAt(int idx){
            if(idx >= this.size() || this.size() == 0) return -1;

            Node tmp = this.head;
            for(int i = 0; i < idx; i++) tmp = tmp.next;
            return tmp.data;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        list.display();
        System.out.println(list.size());

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.getAt(4));
    }    
}
