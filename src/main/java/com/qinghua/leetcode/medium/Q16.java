package com.qinghua.leetcode.medium;

import java.util.Arrays;

public class Q16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int sum = 0;
        int len = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int left = i + 1;
            while (left < len) {
                int right = len - 1;
                while (left < right) {
                    int curSum = curr + nums[left] + nums[right];
                    int curDiff = Math.abs(target - curSum);
                    if (curDiff < diff) {
                        diff = curDiff;
                        sum = curSum;
                    }
                    right--;
                }
                left++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] ints = {0, 2, 1, -3};
        System.out.println(threeSumClosest(ints, 1));
    }
}
