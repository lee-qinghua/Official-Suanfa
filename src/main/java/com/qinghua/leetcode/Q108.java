package com.qinghua.leetcode;

public class Q108 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            return method(nums, 0, nums.length - 1);
        }

        public TreeNode method(int[] nums, int low, int high) {
            if (low>high) return null;
            int mid=(low+high)/2;
            TreeNode treeNode = new TreeNode(nums[mid]);
            treeNode.left=method(nums,low,mid-1);
            treeNode.right=method(nums,mid+1,high);
            return treeNode;
        }
    }
}
