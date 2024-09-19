package GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class Size {
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
            System.out.print(node.data + " -->");
            for(TreeNode child : node.children) System.out.print(child.data + " ");
            System.out.println();
            for(TreeNode child : node.children) display(child);
        }

        int size(TreeNode root){
            int res = 0;

            for(TreeNode child : root.children) res += size(child);
            res += 1;

            return res;
        }
    }

    public static void main(String[] args) {
        GenericTree tree = new GenericTree();

        int[] arr = {10,20,-1,30,50,-1,60,-1,-1,40,-1,-1};

        TreeNode root = tree.construct(arr);
        tree.display(root);

        System.out.println(tree.size(root));
    }
}
