package GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class MaxElem {
    public static class TreeNode{
        int data;
        ArrayList<TreeNode> children;

        TreeNode(){children = new ArrayList<>();}
        TreeNode(int val){
            this.data = val;
            children = new ArrayList<>();
        }
    }

    public static class GenericTree{

        TreeNode construct(int[] arr){
            TreeNode root = new TreeNode(arr[0]);

            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);

            for(int i = 1; i < arr.length; i++){
                if(arr[i] == -1) stack.pop();
                else{
                    TreeNode node = new TreeNode(arr[i]);
                    stack.peek().children.add(node);
                    stack.push(node);
                }
            }

            return root;
        }


        void display(TreeNode node){
            System.out.print(node.data + " --> ");

            for(TreeNode child : node.children) System.out.print(child.data + " ");
            System.out.println();
            for(TreeNode child : node.children) display(child);
        }

        int max(TreeNode node){
            int maxNode = Integer.MIN_VALUE;

            for(TreeNode child : node.children) maxNode = Math.max(maxNode, max(child));

            return Math.max(node.data, maxNode);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,-50,-1,60,-1,-1,-30,-70,-1,80,110,-1,-120,-1,-1,-90,-1,-1,40,100,-1,-1,-1};

        GenericTree tree = new GenericTree();
        TreeNode root = tree.construct(arr);
        // tree.display(root);

        System.out.println(tree.max(root));
    }
}
