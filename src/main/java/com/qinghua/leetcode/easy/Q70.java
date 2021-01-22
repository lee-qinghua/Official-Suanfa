package com.qinghua.leetcode.easy;

import java.util.HashMap;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * 注意：给定 n 是一个正整数。
 */
public class Q70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n) {
        int a = 0, b = 0, c = 1;

        for (int i = 0; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }

}
