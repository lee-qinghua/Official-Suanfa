package com.qinghua.leetcode.easy;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Q257 {
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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        fun(root, res, "");
        return res;
    }

    // 深度优先法
    // 不要先判断null再处理，每一步的逻辑中处理null，
    // 左右子节点分别递归
    public void fun(TreeNode root, List<String> res, String path) {
        if (root != null) {
            StringBuffer buffer = new StringBuffer(path);
            buffer.append(Integer.toString(root.val));
            if (root.left == null && root.right == null) {//当前节点是叶子节点
                res.add(buffer.toString());
            } else {
                buffer.append("->");
                fun(root.left, res, buffer.toString());
                fun(root.right, res, buffer.toString());
            }
        }
    }

}
