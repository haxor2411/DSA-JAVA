package BinaryTree;

import java.util.Stack;

public class Basic {
    public static class TreeNode{
        int data;
        TreeNode left, right;

        TreeNode(int val){this.data = val;}
    }

    public static class Pair{
        TreeNode node;
        int state;

        Pair(TreeNode node){
            this.node = node;
        }
    }
    public static class BinaryTree{
        TreeNode construct(Integer[] arr){
            if(arr.length == 0) return null;

            Stack<Pair> stack = new Stack<>();
            TreeNode root = new TreeNode(arr[0]);
            stack.push(new Pair(root));

            int idx = 1;
            while(stack.size() != 0){
                Pair top = stack.peek();

                if(top.state == 0){
                    Integer val = arr[idx++];
                    if(val != null){
                        TreeNode newNode = new TreeNode(val);
                        top.node.left = newNode;
                        stack.push(new Pair(newNode));
                    }
                    top.state++;
                }
                else if(top.state == 1){
                    Integer val = arr[idx++];
                    if(val != null){
                        TreeNode newNode = new TreeNode(val);
                        top.node.right = newNode;
                        stack.push(new Pair(newNode));
                    }
                    top.state++;
                }
                else stack.pop();
            }
            return root;
        }

        void display(TreeNode node){
            if(node == null) return;
            
            System.out.print(node.left == null ? "." : node.left.data);
            System.out.print(" <- " + node.data + " -> ");
            System.out.println(node.right == null ? "." : node.right.data);

            display(node.left);
            display(node.right);
        }

        int size(TreeNode root){
            if(root == null) return 0;

            int left = size(root.left);
            int right = size(root.right);

            return left + right + 1;
        }

        int max(TreeNode node){
            if(node == null) return Integer.MIN_VALUE;

            int left = max(node.left);
            int right = max(node.right);

            return Math.max(left, Math.max(right, node.data));
        }


        int sum(TreeNode node){
            if(node == null) return 0;

            int left = sum(node.left);
            int right = sum(node.right);

            return left + right + node.data;
        }

        int height(TreeNode node){
            if(node == null) return 0;

            int left = height(node.left);
            int right = height(node.right);

            return Math.max(left, right) + 1;
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {10,20,40,null,null,50,80,null,null,null,30,60,null,90,null,null,70,null,null};
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.construct(arr);
        tree.display(root);
        System.out.println(tree.size(root));
        System.out.println(tree.max(root));
        System.out.println(tree.sum(root));
        System.out.println(tree.height(root));
    }
}