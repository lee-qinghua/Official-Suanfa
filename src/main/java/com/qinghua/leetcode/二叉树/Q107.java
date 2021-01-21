package com.qinghua.leetcode.二叉树;

//给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q107 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //遍历二叉树 广度优先写法
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> levelOrder = new LinkedList<>();

        if (root == null) return levelOrder;

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                TreeNode left = node.left, right = node.right;
                if (left != null) {
                    queue.offer(left);
                }
                if (right != null) {
                    queue.offer(right);
                }
            }
            // 把元素添加到当前的index,所有右边后续的元素index+1,如果当前index有值，index也+1
            levelOrder.add(0, level);
        }

        return levelOrder;
    }

    public List<List<Integer>> method(TreeNode root) {
        List<List<Integer>> ret = new LinkedList<>();
        if (root == null) return ret;

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);

                TreeNode left = node.left, right = node.right;
                if (left != null) {
                    queue.offer(left);
                }
                if (right != null) {
                    queue.offer(right);
                }
            }
            ret.add(0, list);
        }
        return ret;
    }

    public static void main(String[] args) {
        List<Integer> ret = new LinkedList<>();

        ret.add(0,1);
        ret.add(0,2);
        ret.add(0,3);
        ret.add(0,4);
        Object[] array = ret.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
