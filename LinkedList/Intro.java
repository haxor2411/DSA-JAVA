package LinkedList;

public class Intro {
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
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
    }
}
