package com.qinghua.leetcode.medium;

public class Q34 {
    // 暴力法
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target && !flag) {
                flag = true;
                res[0] = i;
                res[1] = i;
            }
            if (nums[i] == target && flag) {
                res[1] = i;
            }
        }
        return res;
    }

    //二分查找
    public static int[] searchRange2(int[] nums, int target) {
        int index = search(nums, target);
        int first = -1;
        int last = -1;
        int[] res = {first, last};
        if (index != -1) {
            int f = index - 1;
            int l = index + 1;

            while (f >= 0) {
                if (nums[f] != target) break;
                f--;
            }
            while (l <= nums.length - 1) {
                if (nums[l] != target) break;
                l++;
            }
            res[0] = f + 1;
            res[1] = l - 1;

        }
        return res;
    }

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,2};
        int[] ints = searchRange2(arr, 2);
        System.out.println();
    }
}
