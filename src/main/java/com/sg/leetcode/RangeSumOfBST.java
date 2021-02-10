/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.leetcode;

import java.util.Stack;
import javax.swing.tree.TreeNode;

/**
 *
 * @author jonat
 */
public class RangeSumOfBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode() {
        }
        public TreeNode(int val) {
            this.val = val;
        }
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    // iterative approach
    public static int rangeSumBST(TreeNode root, int L, int R) {
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        int sum = 0;
        while(!stack.isEmpty()) {
            TreeNode n = stack.pop();
            if(n == null) continue;
            if(n.val >= L && n.val <= R) sum += n.val;
            if(n.val > L) stack.push(n.left);
            if(n.val < R) stack.push(n.right);
        }
        return sum;
    }
    
    // recursive approach
    public static int rangeSumBSTRecursive(TreeNode root, int L, int R) {
        if(root == null) return 0;
        if(root.val < L) return rangeSumBSTRecursive(root.right, L, R);
        if(root.val > R) return rangeSumBSTRecursive(root.left, L, R);
        return root.val + rangeSumBSTRecursive(root.left, L, R) + rangeSumBSTRecursive(root.right, L, R);
    }
    
    public static void main(String[] args) {
        
    }
}




// Given the 'root' node of a binary search tree, return the sum of values of all nodes with a value in the range '[low, high]'.


// Input: low = 7, high = 15
// root = (see tree below)
//         10
//        /  \
//       5   15
//      / \    \
//     3   7   18
// Output: 32
