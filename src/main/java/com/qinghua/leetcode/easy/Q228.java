package com.qinghua.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q228 {
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{1, 3, 4, 5, 8, 9}));

    }

    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        if (nums == null || nums.length == 0) return list;
        StringBuilder builder = new StringBuilder();
        if (nums.length == 1) {
            builder.append(nums[0]);
            list.add(builder.toString());
            return list;
        }

        int start_index = 0;
        int end_index = 0;
        int start = nums[0];
        int end = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 1) {
                end = nums[i];
                end_index++;
            } else {
                if (end_index - start_index > 0) {
                    builder.append(start).append("->").append(end);
                } else {
                    builder.append(start);
                }
                list.add(builder.toString());
                builder.setLength(0);
                end_index = i;
                start_index = i;
                start = nums[i];
            }
            if (i == nums.length - 1) {
                if (end_index - start_index > 0) {
                    builder.append(start).append("->").append(end);
                } else {
                    builder.append(start);
                }
                list.add(builder.toString());
                builder.setLength(0);
            }
        }
        return list;
    }
}
