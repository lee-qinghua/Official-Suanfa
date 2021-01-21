package com.qinghua.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q118 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> list = solution.generate(5);
        System.out.println(list);
    }

    static class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> list = new ArrayList<>();
            if (numRows == 0) return list;

            if (numRows == 1) {
                Integer[] integers = new Integer[]{1};
                List<Integer> list1 = Arrays.asList(integers);
                list.add(list1);
                return list;
            }
            if (numRows == 2) {
                Integer[] integers1 = new Integer[]{1};
                List<Integer> list1 = Arrays.asList(integers1);
                list.add(list1);
                Integer[] integers2 = new Integer[]{1, 1};
                List<Integer> list2 = Arrays.asList(integers2);
                list.add(list2);
                return list;
            }
            Integer[] integers1 = new Integer[]{1};
            List<Integer> list1 = Arrays.asList(integers1);
            list.add(list1);
            Integer[] integers2 = new Integer[]{1, 1};
            List<Integer> list2 = Arrays.asList(integers2);
            list.add(list2);
            for (int i = 2; i < numRows; i++) {
                Integer[] arr = new Integer[i+1];
                List<Integer> arr_before = list.get(i - 1);
                for (int j = 0; j < arr.length; j++) {
                    if (j == 0 || j == i) {
                        arr[j] = 1;
                    } else {
                        arr[j] = arr_before.get(j - 1) + arr_before.get(j);
                    }
                }
                list.add(Arrays.asList(arr));
            }
            return list;
        }
    }
}
