package com.qinghua;

public class 反转二叉树 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        Solution.invertTree(treeNode);
        System.out.println(treeNode.left.val);
        System.out.println(treeNode.right.val);
    }


    static class Solution {
        public static TreeNode invertTree(TreeNode root) {
            TreeNode right = root.right;
            TreeNode left = root.left;
            if (left == null && right == null) {
                return null;
            } else {
                TreeNode tmp = right;
                root.right = left;
                root.left = tmp;
                invertTree(right);
                invertTree(left);
            }
            return root;
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
