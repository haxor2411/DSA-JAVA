package LinkedList;

public class InterSection {
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

        void intersect(LinkedList list1, LinkedList list2){
            int diff = list1.size() - list2.size();

            Node p1 = list1.head, p2 = list2.head;

            for(int i = 0; i < diff; i++) p1 = p1.next;

            while(p1 != p2){
                p1 = p1.next;
                p2 = p2.next;
            }

            while(p1 != null){
                System.out.print(p1.data + " ");
                p1 = p1.next;
            }
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
        
        LinkedList list2 = new LinkedList();

        list2.addLast(80);
        list2.addLast(70);
        list2.head.next.next = list.head.next.next.next.next;

        list2.size += 3;

        list.intersect(list, list2);
    }
}
