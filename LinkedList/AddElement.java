package LinkedList;

public class AddElement {
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

        void addFirst(int val){
            Node node = new Node(val);
            if(this.size() == 0) this.head = this.tail = node;
            else{
                node.next = this.head;
                this.head = node;
            }
            this.size++;
        }

        void addAt(int idx, int val){
            if(idx < 0 || idx >= this.size()) return;
            if(idx == 0) addFirst(val);
            else if(idx == this.size() - 1) addLast(val);
            else{
                Node node = new Node(val);
                
                Node tmp = this.head;
                for(int i = 0; i < idx - 1; i++) tmp = tmp.next;

                Node tmpAddr = tmp.next;
                tmp.next = node;
                node.next = tmpAddr;
                this.size++;
            }

        }

        void display(){
            if(this.head == null){
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
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        list.display();

        list.addFirst(90);
        list.addFirst(80);
        list.addFirst(70);
        list.addFirst(60);

        list.display();
        
        list.addAt(0, 55);
        list.display();
        list.addAt(list.size() - 1, 65);
        list.display();
        list.addAt(5, 75);
        list.display();
    }
}
