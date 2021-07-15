package com.eagle.javacore.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode (int x){
        val = x;
    }
}

public class LaywerTraversal{
    public static void main(String[] args) {
        TreeNode root  = new TreeNode(1);
        TreeNode node1  = new TreeNode(2);
        TreeNode node2  = new TreeNode(3);
        TreeNode node3  = new TreeNode(4);
        TreeNode node4  = new TreeNode(5);
        TreeNode node5  = new TreeNode(6);
        TreeNode node6  = new TreeNode(7);
        TreeNode node7  = new TreeNode(8);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node3.left = node7;
        List<Integer> list = LaywerTraversalTree(root);
        list.forEach(System.out::print);
    }

    public static ArrayList<Integer> LaywerTraversalTree(TreeNode root){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null){
            return list;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            list.add(node.val);
            if(node.left != null){
                queue.offer(node.left);
            }
            if(node.right != null){
                queue.offer(node.right);
            }
        }
        return list;
    }
}




