package com.qinghua.leetcode.二叉树;

import java.util.LinkedList;

public class Q116 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    class Solution {
        public Node connect(Node root) {

            if (root == null) return null;

            LinkedList<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    Node node = queue.pollFirst();
                    if (i == size - 1) {
                        node.next = null;
                    } else {
                        Node nextnode = queue.peekFirst();
                        node.next = nextnode;
                    }
                    Node left = node.left;
                    Node right = node.right;
                    if (left!=null) queue.addLast(left);
                    if (right!=null) queue.addLast(right);
                }
            }
            return root;
        }
    }
}
