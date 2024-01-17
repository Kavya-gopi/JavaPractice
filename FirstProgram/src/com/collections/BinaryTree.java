package com.collections;
class TreeNode{
    int value;
    TreeNode left,right;
    public TreeNode(int value){
        this.value=value;
        left=right=null;
    }
}

public class BinaryTree {
    TreeNode root;
    public BinaryTree(){
        root=null;
    }
    public void insert(int value){
        root=insertRecursive(root,value);
    }
    public TreeNode insertRecursive(TreeNode root,int value){
        if(root==null){
            root=new TreeNode(value);
            return root;
        }
        else if(value<root.value)
            root.left=insertRecursive(root.left,value);
        else if(value>root.value)
            root.right=insertRecursive(root.right,value);
        return root;
    }
    public void inordertraversal(){
        inordertraversalRecursive(root);
    }
    public void inordertraversalRecursive(TreeNode root){
        if(root!=null){
            inordertraversalRecursive(root.left);
            System.out.println(root.value);
            inordertraversalRecursive(root.right);
        }
    }
    public int height(TreeNode node){
        if(node==null){
            return 0;
        }else{
            int leftHeight=height(node.left);//level of left subtree
            int rightHeight=height(node.right);//level of right subtree
            return Math.max(leftHeight,rightHeight)+1;
        }
    }
    public void preordertraversal(){
        preordertraversalRecursive(root);
    }
    public void preordertraversalRecursive(TreeNode root){
        if(root!=null){
            System.out.println(root.value);
            preordertraversalRecursive(root.left);
            preordertraversalRecursive(root.right);

        }
    }

    public static void main(String args[]){
        BinaryTree btree=new BinaryTree();
        btree.insert(105);
        btree.insert(101);
        btree.insert(200);
        btree.insert(98);
        btree.insert(72);
        btree.insert(126);
        btree.insert(179);
        btree.insert(5);
        btree.inordertraversal();
        btree.preordertraversalRecursive(btree.root);
        System.out.println(btree.height(btree.root));




    }

}
