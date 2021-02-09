package com.qinghua.leetcode.easy;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Q235 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 遍历一次
     * 如果比当前节点值大就右移，如果小就左移。
     * 当pq出现一个左移一个右移分岔的时候，当前这个节点就是他们最小祖先节点
     */
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode res = null;

        TreeNode tmp = root;
        while (tmp != null) {
            if (p.val > tmp.val && q.val > tmp.val) {
                res = tmp;
            } else if (p.val < tmp.val && q.val < tmp.val) {
                res = tmp;
            } else {
                res = tmp;
                break;
            }
        }
        return res;
    }

    /**
     * 遍历两次，把路径记录下来
     * 找两个路径相似的元素最后相似的那个
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> list1 = new ArrayList<>();
        List<TreeNode> list2 = new ArrayList<>();

        TreeNode temp1 = root, temp2 = root;
        while (temp1 != null) {
            list1.add(temp1);
            if (temp1 == p) {
                break;
            } else if (p.val > temp1.val) {
                temp1 = temp1.right;
            } else {
                temp1 = temp1.left;
            }
        }

        while (temp2 != null) {
            list2.add(temp2);
            if (temp2 == q) {
                break;
            } else if (q.val > temp2.val) {
                temp2 = temp2.right;
            } else {
                temp2 = temp2.left;
            }
        }

        // 已经把pq经过的所有路径都存到list中了

        TreeNode res = list1.get(0);
        int size = Math.min(list1.size(), list2.size());

        for (int i = 1; i < size; i++) {
            if (list1.get(i) == list2.get(i)) {
                res = list1.get(i);
            } else {
                break;
            }
        }
        return res;
    }
}
