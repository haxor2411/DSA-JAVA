import java.util.ArrayList;
import java.util.Stack;

public class MaximuminGenericTree {
    public static class Node{
        int data;
        ArrayList<Node> children;

        Node(){
            children = new ArrayList<>();
        }

        Node(int val){
            data = val;
            children = new ArrayList<>();
        }
    }

    public static Node construct(int[] input){
        Stack<Node> st = new Stack<>();
        Node root = new Node(input[0]);
        st.push(root);
        for(int i = 1; i < input.length; i++){
            if(input[i] == -1){
                st.pop();
            }
            else{
                Node newNode = new Node(input[i]);
                st.peek().children.add(newNode);
                st.push(newNode);
            }
        }
        return root;
    }

    public static void display(Node node){
        System.out.print(node.data + " -> ");
        for(Node child : node.children){
            System.out.print(child.data + " ");
        }
        System.out.println();
        for(Node child : node.children){
            display(child);
        }
    }

    public static int maximumElem(Node node){
        int max = Integer.MIN_VALUE;
        for(Node child : node.children){
           max = Math.max(max, maximumElem(child));
        }
        max = Math.max(max, node.data);

        return max;
    }

    public static void main(String[] args) {
        int[] input = {10, 20, -1, 30, 150, -1, -60, -1, -1, 40, -1, -1};
        Node root = construct(input);
        display(root);
        System.out.println(maximumElem(root));
    }
}
