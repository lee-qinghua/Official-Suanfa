package com.qinghua.leetcode.easy;

public class Q283 {
    // 左指针 右指针，左指针慢指针，左指针左边都是大于0的数，右指针左边到左指针都是0
    public void moveZeroes(int[] nums) {
        int left = 0, right = 0, n = nums.length;

        while (right < n) {
            if (nums[right] != 0) {
                // 做指针右指针的数交换，同时增加指针
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public void swap(int[] nums, int left, int right) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }
}
