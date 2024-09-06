package LinkedList;

// Data Iterative       
public class ReverseLinkedList {
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

        // Data Iterative : O(n^2)
        void reverseDI(){
            int lp = 0, rp = this.size() - 1;
            while(lp < rp){
                Node left = getNode(lp);
                Node right = getNode(rp);

                int tmp = right.data;
                right.data = left.data;
                left.data = tmp;

                lp++;
                rp--;
            }
        }

        Node getNode(int idx){
            Node tmp = this.head;
            for(int i = 0; i < idx; i++) tmp = tmp.next;
            return tmp;
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

        list.reverseDI();

        list.display();
    }
}
