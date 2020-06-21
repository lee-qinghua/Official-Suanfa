package com.qinghua.lianxi;

import java.io.*;

public class 二分查找 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(89>>1);
    }

    public static int method(int[] arr, int target) {
        if (arr == null) return -1;
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (target > arr[mid]) {
                left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
