package com.qinghua.leetcode.二叉树;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ResultTreeType;

import java.util.*;

public class Q515 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public List<Integer> largestValues(TreeNode root) {
            ArrayList<Integer> ret = new ArrayList<>();
            if (root == null) return ret;

            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int max = Integer.MIN_VALUE;
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.pollFirst();
                    max = Math.max(max, node.val);
                    TreeNode left = node.left;
                    TreeNode right = node.right;
                    if (left != null) queue.addLast(left);
                    if (right != null) queue.addLast(right);
                }
                ret.add(max);
            }
            return ret;
        }
    }
}
