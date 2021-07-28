package com.qinghua.leetcode.medium;

import java.util.Arrays;

public class Q45 {
    private static int count = 0;

    public static int jump(int[] nums) {
        aa(nums);
        return count;
    }

    public static void aa(int[] nums) {
        if (count == 0 && nums.length == 1) return;
        count += 1;
        if (nums.length == 1) return;
        int minIndex = nums.length;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums.length - i - 1 > nums[i]) continue;
            minIndex = i;
        }
        if (minIndex == 0) return;
        aa(Arrays.copyOfRange(nums, 0, minIndex + 1));
    }

    public static void main(String[] args) {
        System.out.println(jump(new int[]{1, 1, 1, 1}));
    }
}
