package com.qinghua;

import java.util.Arrays;

public class 数组中第k个最大元素 {
    public static void main(String[] args) {

    }

    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        Arrays.sort(nums);
        return nums[len - k];
    }
}



