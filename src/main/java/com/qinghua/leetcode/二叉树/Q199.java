package com.qinghua.leetcode.二叉树;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q199 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ret = new ArrayList<>();
            if(root==null) return ret;

            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while (!queue.isEmpty()){
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.pollFirst();
                    if (i==0){
                        ret.add(node.val);
                    }
                    TreeNode left = node.left;
                    TreeNode right = node.right;

                    if (right!=null){
                        queue.addLast(right);
                    }
                    if (left!=null){
                        queue.addLast(left);
                    }
                }
            }
            return ret;
        }
    }
}
