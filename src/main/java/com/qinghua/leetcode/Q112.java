package com.qinghua.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q112 {
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
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null) return false;
            int value = root.val;
            TreeNode left = root.left;
            TreeNode right = root.right;

            if (left == null && right == null) {
                return value == targetSum;
            }
            return hasPathSum(left, targetSum - value) || hasPathSum(right, targetSum - value);
        }
    }

    class Solution2 {
        public boolean hasPathSum2(TreeNode root, int targetSum) {
            if (root == null) return false;
            List<Integer> list = new ArrayList<Integer>();
            list.add(root.val);
            return fun(root, list, targetSum);
        }

        private boolean fun(TreeNode root, List<Integer> list, int targetSum) {
            if (root == null) return false;
            if (sum(list) == targetSum && root.left == null && root.right == null) {
                return true;
            }
            // 如果这一步计算不出结果，就看左边是否符合或者右边是否符合
            boolean left_flag = false;
            boolean right_flag = false;
            if (root.left != null) {
                List<Integer> left_list = new ArrayList<>(list);
                left_list.add(root.left.val);
                left_flag = fun(root.left, left_list, targetSum);
            }
            if (root.right != null) {
                List<Integer> right_list = new ArrayList<>(list);
                right_list.add(root.right.val);
                right_flag = fun(root.right, right_list, targetSum);
            }
            return left_flag || right_flag;
        }

        private int sum(List<Integer> list) {
            int sum = 0;
            for (Integer integer : list) {
                sum += integer;
            }
            return sum;
        }
    }
}
