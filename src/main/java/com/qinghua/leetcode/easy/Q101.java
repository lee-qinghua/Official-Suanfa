package com.qinghua.leetcode.easy;

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
        if (root==null) return true;
        TreeNode left = root.left;
        TreeNode right = root.right;

        return check(left, right);
    }

    public boolean check(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        } else if (left.val != right.val) {
            return false;
        } else {
            return check(left.left, right.right) && check(left.right, right.left);
        }
    }


}
