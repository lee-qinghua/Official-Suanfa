package com.qinghua.leetcode;

import com.sun.org.apache.bcel.internal.util.BCELifier;

/**
 * 实现 int sqrt(int x) 函数。
 * <p>
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * <p>
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 */

//todo
public class Q69 {
    public static void main(String[] args) {

    }

    public int mySqrt(int x) {
        long left = 0;
        long right = x / 2 + 1;
        while (left < right) {
            long mid = (left + right + 1) / 2;
            long square = mid * mid;
            if (square > x) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return (int) left;
    }
}
