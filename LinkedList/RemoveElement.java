package LinkedList;

public class RemoveElement {
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

        void removeFirst(){
            if(this.size() == 0){
                System.out.println("Empty");
                return;
            }
            if(this.size() == 1) this.head = this.tail = null;
            else{
                Node tmp = this.head.next;
                this.head.next = null;
                this.head = tmp;       
            }

            this.size--;
        }

        void removeLast(){
            if(this.size() == 0){
                System.out.println("Empty");
                return;
            }
            if(this.size() == 1) this.head = this.tail = null;
            else{
                Node tmp = this.head;
                while(tmp.next != this.tail) tmp = tmp.next;
                tmp.next = null;
                this.tail = tmp;
            }
            this.size--;
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
        
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        
        System.out.println(list.size());
        list.display();
        
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();

        list.display();

        list.addLast(100);
        list.addLast(200);
        list.addLast(300);
        list.addLast(400);
        list.addLast(500);

        list.removeLast();
        list.removeLast();
        list.display();

        list.removeLast();
        list.display();
        
        System.out.println(list.size());
        
        list.removeLast();
        list.removeLast();
        list.removeLast();
    }    
}
