package com.qinghua.leetcode.medium;

public class Q55 {
    // 从后往前判断是否可以到达最后一个元素

    public static boolean canJump(int[] nums) {
        return jump(nums, nums.length - 1);
    }

    public static boolean jump(int[] nums, int end) {
        if (end == 0) return true;
        for (int i = end - 1; i >= 0; i--) {
            if (end - i > nums[i]) {
                // 跳不到继续判断前一个index的位置
                continue;
            } else {
                // 可以调到，那就判断前边的元素能否调到当前位置
                return jump(nums, i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean a = canJump(new int[]{2, 3, 1, 1, 4});
        System.out.println(a);
    }
}
