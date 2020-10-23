package com.qinghua.leetcode;

import java.util.Arrays;
import java.util.List;

public class Q88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        merge(nums1, 3, nums2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1_copy = new int[m];
        System.arraycopy(nums1, 0, nums1_copy, 0, m);

        int p1 = 0;
        int p2 = 0;

        int p = 0;

        while (p1 < m && p2 < n) {
            nums1[p] = nums1_copy[p1] <= nums2[p2] ? nums1_copy[p1++] : nums2[p2++];
            p++;
        }

        if (p1 < m) {
            System.arraycopy(nums1_copy, p1, nums1, p1 + p2, m + n - p1 - p2);
        }
        if (p2 < n)
            System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2);
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        //从后往前
        int[] nums1_copy = new int[m];
        System.arraycopy(nums1, 0, nums1_copy, 0, m);

        int p1 = m - 1;
        int p2 = n - 1;

        int p = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            nums1[p--] = nums1_copy[p1] < nums2[p2] ? nums2[p2--] : nums1_copy[p1--];
        }

        // 如果
        System.arraycopy(nums2,0,nums1,0,p2+1);

    }
}
