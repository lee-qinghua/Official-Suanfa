package com.qinghua.leetcode;

public class Q101 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {

        TreeNode left = root.left;
        TreeNode right = root.right;

        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        } else if (left.val != right.val) {
            return false;
        } else {
            return isSymmetric(left) && isSymmetric(right);
        }
    }

    public boolean check(TreeNode p, TreeNode q) {

    }


}
