package com.qinghua.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;

public class Q268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] != 0) return 0;
        if (nums[nums.length - 1] != nums.length) return nums.length;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] > 1) {
                return nums[i] - 1;
            }
        }
        return 0;
    }

    public int missingNumber2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (!set.contains(i)) return i;
        }
        return -1;
    }

    //异或的方法，两个相同的数异或为0
    public int missingNumber3(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ i ^ nums[i];
        }
        return res;
    }
}
