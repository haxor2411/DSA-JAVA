import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrder {
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

    public static void levelorder(Node node){
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
        while(queue.size() > 0){
            Node fnode = queue.remove(); //remove
            System.out.print(fnode.data + " "); //print
            for(Node child : fnode.children){
                queue.add(child); //add
            }
        }
    }

    public static void levelorderlinewise(Node node){
        Queue<Node> mainq = new ArrayDeque<>();
        Queue<Node> helperq = new ArrayDeque<>();
        mainq.add(node);
        while(mainq.size() > 0){
            Node fnode = mainq.remove();
            System.out.print(fnode.data + " ");
            for(Node child : fnode.children){
                helperq.add(child);
            }

            if(mainq.size() == 0){
                System.out.println();
                Queue<Node> tmp = mainq;
                mainq = helperq;
                helperq = tmp;
            }

        }
    }

    public static void main(String[] args) {
        int[] input = {10, 20, 50, -1, 60, -1, -1, 30, 70,-1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        Node root = construct(input);
        // levelorder(root);
        levelorderlinewise(root);
    }
}
