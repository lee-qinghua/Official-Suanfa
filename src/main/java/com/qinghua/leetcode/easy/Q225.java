package com.qinghua.leetcode.easy;

import java.util.LinkedList;

public class Q225 {
    class MyStack {

        LinkedList<Integer> list = new LinkedList<Integer>();

        /**
         * Initialize your data structure here.
         */
        public MyStack() {

        }

        /**
         * Push element x onto stack.
         */
        public void push(int x) {
            list.addFirst(x);
        }

        /**
         * Removes the element on top of the stack and returns that element.
         */
        public int pop() {
            return list.pollFirst();
        }

        /**
         * Get the top element.
         */
        public int top() {
            return list.getFirst();
        }

        /**
         * Returns whether the stack is empty.
         */
        public boolean empty() {
            return list.isEmpty();
        }
    }
}
