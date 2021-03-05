package com.qinghua.leetcode.easy;

import java.util.*;

public class Q350 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        HashSet<Integer> list = new HashSet<>();
        for (int i : nums2) {
            if (set.contains(i)) {
                list.add(i);
            }
        }
        int[] res = new int[list.size()];
        Iterator<Integer> iterator = list.iterator();
        for (int i = 0; i < list.size(); i++) {
            res[i] = iterator.next();
        }
        return res;
    }
}
