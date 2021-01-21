package com.qinghua.leetcode.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q637 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public List<Double> averageOfLevels(TreeNode root) {
            ArrayList<Double> ret = new ArrayList<>();
            if (root == null) return ret;
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                double sum = 0;
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.pollFirst();
                    sum+=node.val;
                    TreeNode left = node.left;
                    TreeNode right = node.right;
                    if (left!=null){
                        queue.offerLast(left);
                    }
                    if (right!=null){
                        queue.offerLast(right);
                    }
                }
                ret.add(sum/size);
            }
            return ret;
        }
    }
}
