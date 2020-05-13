package com.qinghua.lianxi;

public class 搜索插入位置 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        System.out.println(searchInsert(arr, 4));
    }

    public static int searchInsert(int[] nums, int target) {
        int a = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int value = Math.abs(nums[i] - target);
            if (value == 0) {
                return i;
            } else if (value < min) {
                a = i;
                min = value;
            } else {
                a = i;
                break;
            }
        }
        return a == nums.length-1 ? a + 1 : a;
    }
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int left = 0, right = nums.length - 1; // 注意
            while(left < right) { // 注意
                int mid = (left + right) / 2; // 注意
                if(nums[mid] == target) { // 注意
                    return mid;
                } else if(nums[mid] < target) {
                    left = mid + 1; // 注意
                } else {
                    right = mid; // 注意
                }
            }
            // 相关返回值
            return left;
        }
    }

}
