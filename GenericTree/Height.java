package GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class Height {
    public static class TreeNode{
        int data;
        ArrayList<TreeNode> children;
        
        TreeNode(){
            children = new ArrayList<>();
        }
        TreeNode(int val){
            this.data = val;
            children = new ArrayList<>();
        }
    }


    public static class GenericTree{
        TreeNode root;

        TreeNode construct(int[] arr){
            root = new TreeNode(arr[0]);

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


        void displayTree(TreeNode root){
            System.out.print(root.data + " --> ");
            for(TreeNode child : root.children) System.out.print(child.data + " ");
            System.out.println();

            for(TreeNode child : root.children) displayTree(child);
        }

        int height(TreeNode node){
            int ht = -1; // for edges || for nodes ht = 0;

            for(TreeNode child : node.children) ht = Math.max(ht, height(child));

            return ht + 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,-1,30,50,-1,60,-1,-1,40,-1,-1};

        GenericTree tree = new GenericTree();
        TreeNode root = tree.construct(arr);

        tree.displayTree(root);

        System.out.println(tree.height(root));
    }
}
