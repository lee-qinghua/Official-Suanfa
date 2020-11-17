package com.qinghua.leetcode.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q429 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    class Solution {
        public List<List<Integer>> levelOrder(Node root) {
            List<List<Integer>> ret = new ArrayList<>();
            if (root == null) return ret;

            LinkedList<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                List<Integer> list = new ArrayList<>();
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    Node node = queue.pollFirst();
                    list.add(node.val);
                    List<Node> children = node.children;
                    if (children!=null){
                        for (Node child : children) {
                            queue.addLast(child);
                        }
                    }
                }
                ret.add(list);
            }
            return ret;
        }
    }
}
