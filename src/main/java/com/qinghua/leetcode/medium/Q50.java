package com.qinghua.leetcode.medium;


// 快速幂+递归
// 从后往前计算，90次方=45次方*45次方     45次方=22次方*22次方*1次方
public class Q50 {
    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }

    private double quickMul(double x, long n) {
        if (n == 0) return 1.0;
        double y = quickMul(x, n / 2);

        return n % 2 == 0 ? y * y : y * y * x;
    }
}
