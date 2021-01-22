package com.qinghua.leetcode.easy;

public class Q122 {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        int res = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            res += Math.max(0, prices[i + 1] - prices[i]);
        }
        return res;
    }
}
