package com.qinghua.leetcode.medium;

public class Q11 {
    public static int maxArea(int[] height) {
        int left = 1;
        int right = height.length;

        int maxA = 0;
        while (left < right) {
            int leftH = height[left - 1];
            int rightH = height[right - 1];

            int area = Math.min(leftH, rightH) * (right - left);
            maxA = Math.max(maxA, area);

            if (leftH > rightH) {
                right--;
            } else {
                left++;
            }
        }
        return maxA;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 18, 17, 6};
        System.out.println(maxArea(arr));
    }
}
