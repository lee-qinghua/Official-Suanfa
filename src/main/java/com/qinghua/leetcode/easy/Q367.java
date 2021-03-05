package com.qinghua.leetcode.easy;

public class Q367 {
    // timeout
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        for (int i = 1; i < num / 2; i++) {
            if (i * i == num) return true;
        }
        return false;
    }

    // binary search
    // 求平方时 可以用除以当前的数比较大小，来避免两个数相乘超出int的范围
    public static boolean isPerfectSquare2(int num) {
        if (num == 1) return true;
        int left = 2;
        int right = num / 2; // 自定义的一个初始值
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid == num / mid && num % mid == 0) {
                return true;
            } else if (num / mid >= mid) {
                left = mid + 1;
            } else if (num / mid <= mid) {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare2(16));
    }
}
