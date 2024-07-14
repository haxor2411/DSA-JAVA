import java.util.ArrayList;
import java.util.Stack;

public class HeightofGenericTree {
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


    public static int height(Node node){
        //int height = 0 on the basis of nodes
        int height = -1; //on the basis of edges
        for(Node child : node.children){
            height = Math.max(height, height(child));
        }
        height += 1;
        return height;
    }

    public static void main(String[] args) {
        int[] input = {10, 20, 50, -1, 60, -1, -1, 30, 70,-1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        Node root = construct(input);
        System.out.println(height(root));
        display(root);
    }
}

