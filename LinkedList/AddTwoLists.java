package LinkedList;

public class AddTwoLists{
    public static class Node{
        int data;
        Node next;

        Node(int val){ this.data = val;}
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

        void addFirst(int val){
            Node node = new Node(val);

            if(this.size() == 0) this.head = this.tail = node;
            else{
                node.next = this.head;
                this.head = node;
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

        void addLists(LinkedList list1, LinkedList list2){
            int pos1 = list1.size();
            int pos2 = list2.size();

            LinkedList ans = new LinkedList();

            int carry = helper(list1.head, list2.head, pos1, pos2, ans);
            if(carry != 0) ans.addFirst(carry);

            ans.display();
        }

        int helper(Node head1, Node head2, int pos1, int pos2, LinkedList ans){
            if(head1 == null && head2 == null) return 0;
            int carry = 0;
            int sum = 0;
            if(pos1 < pos2) {
                carry = helper(head1, head2.next, pos1, pos2 - 1, ans);
                sum = head2.data + carry;
            }    
            else if(pos1 > pos2){
                carry = helper(head1.next, head2, pos1 - 1, pos2, ans);
                sum = head1.data + carry;
            }   
            else{
                carry = helper(head1.next, head2.next, pos1 - 1, pos2 - 1, ans);
                sum = head1.data + head2.data + carry;
            }

            int digit = sum % 10;

            ans.addFirst(digit);
            return (sum < 10) ? 0 : sum / 10;
        }
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();

        list1.addLast(9);
        list1.addLast(9);
        list1.addLast(3);
        list1.addLast(4);
        list1.addLast(5);
        list1.display();

        LinkedList list2 = new LinkedList();

        list2.addLast(9);
        list2.addLast(9);
        list2.addLast(9);
        list2.display();

        list1.addLists(list1, list2);
    }
}