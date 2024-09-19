package LinkedList;

public class MergeSort {
    public static class Node{
        int data;
        Node next;

        Node(int val){this.data = val;}
    }

    public static class LinkedList{
        int size;
        Node head, tail;

        LinkedList(){}
        LinkedList(int data){ this.addLast(data);}

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

        LinkedList mergeSort(){
            return helper(this.head, this.tail);
        }


        LinkedList helper(Node head, Node tail){
            if(head == tail){
                return new LinkedList(head.data);
            }
            Node slow = head, fast = head;
            while(fast != tail && fast.next != tail){
                slow = slow.next;
                fast = fast.next.next;
            }
            
            LinkedList left = helper(head, slow);
            LinkedList right = helper(slow.next, tail);
            return merge(left, right);
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(10);
        list.addLast(5);
        list.addLast(17);
        list.addLast(16);
        list.addLast(9);
        list.addLast(1);
        list.addLast(2);
        list.addLast(7);
        list.addLast(14);

        LinkedList sorted = list.mergeSort();

        sorted.display();
    }
}
