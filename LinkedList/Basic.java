
public class Basic {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        int size;
        Node head;
        Node tail;
        int size(){
            return size;
        }
        void addLast(int val){
            Node node = new Node();
            node.data = val;
            if(size == 0){
                head = tail = node;
            }
            else{
                tail.next = node;
                tail = node;
            }
            size++;
        }
        void display(){
            Node tmp = new Node();
            tmp = head;
            while(tmp != null){
                System.out.print(tmp.data + " ");
                tmp = tmp.next;
            }
            System.out.println();
        }
        void removeFirst(){
            if(size == 0){
                System.out.println("List is empty");
                return;
            }
            if(size == 1){
                head = tail = null;
            }
            else{
                Node nbr = head.next;
                head.next = null;
                head = nbr; 
            }
            size--;
        }
        int getValue(int x){
            Node tmp = head;
            if(size == 0){
                System.out.println("List is Empty");
                return -1;
            }
            if(x < 0 || x > size){
                System.out.println("Index out of bounds");
                return -1;
            }
            while(x > 0){
                tmp = tmp.next;
                x--;
            }
            return tmp.data;
        }
        void addFirst(int val){
            Node node = new Node();
            node.data = val;
            if(size == 0){
                head = tail = node;
            }else{
                node.next = head;
                head = node;
            }
            size++;
        }
        void removeLast(){
            if(size == 0){
                System.out.println("list is empty");
                return;
            }
            if(size == 1){
                head = tail = null;
            }
            else{
                Node tmp = head;
                while(tmp.next != tail){
                    tmp = tmp.next;
                }
                tmp.next = null;
                tail = tmp;
            }
            size--;
        }
        void addAt(int idx, int val){
            if(idx < 0 || idx > size){
                System.out.println("Index out of bounds");
                return;
            }
            Node newNode = new Node();
            newNode.data = val;
            Node tmp = head;
            if(idx == 0){
                addFirst(val);
            }
            else if(idx == size){
                addLast(val);
            }
            else{
                while(idx > 1){
                    tmp = tmp.next;
                    idx--;
                }
                newNode.next = tmp.next;
                tmp.next = newNode;
                size++;
            }
        }
        void removeAt(int idx){
            if(idx < 0 || idx >= size){
                System.out.println("Index out of bounds");
                return;
            }
            if(idx == 0){
                removeFirst();
                return;
            }
            Node tmp = head; 
            while(idx > 1){
                tmp = tmp.next;
                idx--;
            }
            Node nbr = tmp.next;
            tmp.next = nbr.next;
            nbr.next = null;
            size--;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        // list.removeFirst();
        // list.removeLast();
        // list.addFirst(25);
        list.addAt(4, 75);
        list.removeAt(4);
        list.display();
        System.out.println(list.getValue(1));
        System.out.println(list.size());
    }
}
