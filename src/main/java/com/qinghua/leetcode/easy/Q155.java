package com.qinghua.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q155 {
    class MinStack {
        int minValue = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<Integer>();

        /**
         * initialize your data structure here.
         */
        public MinStack() {

        }

        public void push(int x) {
            minValue = Math.min(minValue, x);
            list.add(x);
        }

        public void pop() {
            int top = top();
            list.remove(list.size() - 1);
            if (top < minValue) {
                minValue = Integer.MAX_VALUE;
                for (Integer integer : list) {
                    minValue = Math.min(minValue, integer);
                }
            }
        }

        public int top() {
            return list.get(list.size() - 1);
        }

        public int getMin() {
            return minValue;
        }
    }

}
