package LinkedList;

public class ReverseDataIterative {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        int size;
        Node head;
        Node tail;
        void add(int val){
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
            Node tmp = head;
            while(tmp != null){
                System.out.print(tmp.data + " ");
                tmp = tmp.next;
            }
        }
        Node getNode(int x){
            Node tmp = head;
            if(size == 0){
                return null;
            }
            if(x < 0 || x > size){
                return null;
            }
            while(x > 0){
                tmp = tmp.next;
                x--;
            }
            return tmp;
        }
        void reverseDI(){
            int lp = 0;
            int rp = size - 1;
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
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.reverseDI();
        list.display();
    }

}
