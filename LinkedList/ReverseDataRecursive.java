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
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.display();
    }
}
