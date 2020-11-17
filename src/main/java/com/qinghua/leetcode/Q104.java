package com.qinghua.leetcode;

/**
 * 给定一个二叉树，找出其最大深度。 下面的深度为3
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 */
public class Q104 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int lh = maxDepth(root.left);
            int rh = maxDepth(root.right);
            return Math.max(lh, rh) + 1;
        }

    }


}
