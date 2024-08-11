package LinkedList;
public class ReverseDataRecursive {
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
        static Node leftRev;
        void reverseDR(){
            leftRev = head;
            reverseDRHelper(head, 0);
        }
        void reverseDRHelper(Node node, int idx){
            if(node == null){
                return;
            }
            reverseDRHelper(node.next, idx + 1);
            if(idx >= size/2){
                Node right = node; 
                int tmp = right.data;
                right.data = leftRev.data;
                leftRev.data = tmp;
                leftRev = leftRev.next;
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
        list.add(60);
        list.reverseDR();
        list.display();
    }
}
