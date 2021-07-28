package com.qinghua.leetcode.medium;

import java.util.Arrays;

public class Q31 {
    public void nextPermutation(int[] nums) {
        for (int i = nums.length - 1; i - 1 >= 0; i--) {
            //612354
            if (nums[i] < nums[i - 1]) continue;
                //612345
            else if (nums[i] > nums[i - 1]) {
                if (i == nums.length - 1) {
                    swap(nums, i, i - 1);
                    return;
                }
                int min = nums[i];
                int minIndex = i;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i - 1] < nums[j] && min > nums[j]) {
                        min = nums[j];
                        minIndex = j;
                    }
                }
                swap(nums, i - 1, minIndex);
                Arrays.sort(nums, i, nums.length);
                return;
            }
        }
        Arrays.sort(nums);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
