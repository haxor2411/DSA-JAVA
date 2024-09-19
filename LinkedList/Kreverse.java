package LinkedList;

public class Kreverse {
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

        void addFirst(int val){
            Node node = new Node(val);
            if(this.size() == 0) this.head = this.tail = node;
            else{
                node.next = this.head;
                this.head = node;
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

        void kReverse(int k){
            LinkedList curr = new LinkedList();
            LinkedList ans = new LinkedList();

            while(this.size() != 0){
                // if grouping : removeFirst + addFirst
                if(this.size() >= k){
                    for(int i = 0; i < k; i++){
                        int tmp = this.getFirst();
                        this.removeFirst();
                        curr.addFirst(tmp);
                    }
                }
                else{
                    while(this.size() != 0){
                        int tmp = this.getFirst();
                        this.removeFirst();
                        curr.addLast(tmp);
                    }
                }

                if(ans.size() == 0) ans = curr;
                else{
                    ans.tail.next = curr.head;
                    ans.tail = curr.tail;
                    ans.size += curr.size;
                }
                curr = new LinkedList();
            }

            this.head = ans.head;
            this.tail = ans.tail;
            this.size = ans.size;
        }


        void displayReverse(){
            helper(this.head);
            System.out.println();
        }

        void helper(Node node){
            if(node == null) return;

            helper(node.next);
            System.out.print(node.data + " ");
        }
    }    

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);
        list.addLast(10);
        list.addLast(11);

        list.display();
        list.displayReverse();

        list.kReverse(3);

        list.display();
    }
}
