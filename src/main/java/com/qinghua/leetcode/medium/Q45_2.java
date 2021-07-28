package com.qinghua.leetcode.medium;

import java.util.Arrays;

public class Q45_2 {

    private static int cnt = 0;

    public static int jump(int[] nums) {
        aa(nums);
        return cnt;
    }

    private static void aa(int[] nums) {
        if (nums.length == 2) {
            cnt++;
            return;
        }
        cnt++;
        // 每次都找一个跳一次可以跳最大长度到终点的index.
        int minIndex = nums.length;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums.length - i - 1 <= nums[i]) {
                minIndex = i;
            }
        }

        aa(Arrays.copyOfRange(nums, 0, minIndex + 1));
    }

    public static void main(String[] args) {
        System.out.println(jump(new int[]{2, 3, 0, 1, 4}));
    }

}
