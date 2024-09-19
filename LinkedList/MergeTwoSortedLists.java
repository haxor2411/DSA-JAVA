package LinkedList;

public class MergeTwoSortedLists {
    public static class Node{
        int data;
        Node next;

        Node(int val){this.data = val;}
    }

    public static class LinkedList{
        int size;
        Node head, tail;

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
            Node tmp = this.head;
            while(tmp != null){
                System.out.print(tmp.data + " ");
                tmp = tmp.next;
            }
            System.out.println();
        }

        LinkedList merge(LinkedList list1, LinkedList list2){
            LinkedList ans = new LinkedList();
            Node p1 = list1.head;
            Node p2 = list2.head;

            while(p1 != null && p2 != null){
                if(p1.data < p2.data){
                    ans.addLast(p1.data);
                    p1 = p1.next;
                }
                else{
                    ans.addLast(p2.data);
                    p2 = p2.next;
                }
            }

            while(p1 != null) {
                ans.addLast(p1.data);
                p1 = p1.next;
            }
            while(p2 != null) {
                ans.addLast(p2.data);
                p2 = p2.next;
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();

        list1.addLast(1);
        list1.addLast(3);
        list1.addLast(4);
        list1.addLast(6);
        list1.addLast(10);
        list1.addLast(11);
        list1.addLast(12);

        LinkedList list2 = new LinkedList();

        list2.addLast(2);
        list2.addLast(5);
        list2.addLast(7);
        list2.addLast(8);
        list2.addLast(9);

        LinkedList ans = list1.merge(list1, list2);

        ans.display();
    }
}
