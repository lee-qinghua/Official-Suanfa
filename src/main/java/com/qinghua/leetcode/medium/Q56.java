package com.qinghua.leetcode.medium;

import java.util.Arrays;

public class Q56 {
    public int[][] merge(int[][] intervals) {
        // 首先按照区间的起始位置排序
        Arrays.sort(intervals, (arr1, arr2) -> arr1[0] - arr2[0]);

        // 遍历
        int[][] res = new int[intervals.length][2];
        int idx = -1; //记录上一个数组的index
        for (int i = 0; i < intervals.length; i++) {
            // 如果数组是空的或者当前区间的start 大于上一个区间的end 直接放入
            if (idx == -1 || intervals[i][0] > res[idx][1]) {
                res[++idx] = intervals[i];
            } else {
                // 需要合并
                res[idx][1] = Math.max(intervals[i][1], res[idx][1]);
            }
        }
        return Arrays.copyOf(res, idx + 1);
    }
}
