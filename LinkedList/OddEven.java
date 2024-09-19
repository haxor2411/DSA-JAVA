package LinkedList;

public class OddEven {
    public static class Node{
        int data;
        Node next;

        Node(int val) {this.data = val;}
    }

    public static class LinkedList{
        int size;
        Node head, tail;

        int size(){return this.size;}

        void addLast(int val){
            Node node  = new Node(val);
            if(this.size() == 0) this.head = this.tail = node;
            else {
                this.tail.next = node;
                this.tail = node;
            } 
            this.size++;
        }

        void removeFirst(){
            if(this.size() == 0) return;
            if(this.size() == 1) this.head = this.tail = null;
            else{
                Node tmp = this.head.next;
                this.head.next = null;
                this.head = tmp;
            }
            this.size--;
        }

        int getFirst(){return this.head.data;}

        void display(){
            Node tmp = this.head;
            while(tmp != null){
                System.out.print(tmp.data + " ");
                tmp = tmp.next;
            }
            System.out.println();
        }

        void oddEven(){
            if(this.size() == 0) return;

            LinkedList even = new LinkedList();
            LinkedList odd = new LinkedList();

            while(this.size() != 0){
                int tmp = this.getFirst();
                if(tmp % 2 == 0) even.addLast(tmp);
                else odd.addLast(tmp);
                this.removeFirst();
            }

            if(odd.size() == 0){
                this.head = even.head;
                this.tail = even.tail;
                this.size = even.size();
            }
            else if(even.size() == 0){
                this.head = odd.head;
                this.tail = odd.tail;
                this.size = odd.size();
            }
            else{
                odd.tail.next = even.head;
                this.head = odd.head;
                this.tail = even.tail;
                this.size = odd.size() + even.size();
            }
        }
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.addLast(11);
        list.addLast(21);
        list.addLast(31);
        list.addLast(41);
        list.addLast(51);
        list.addLast(61);

        list.display();

        list.oddEven();

        list.display();
    }
}
