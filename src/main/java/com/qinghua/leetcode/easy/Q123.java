package com.qinghua.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 最多限制卖出两次
 */
public class Q123 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 2, 5, 7, 2, 4, 9, 0};
        int profit = maxProfit(arr);
        System.out.println(profit);
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int dp1 = prices[0];
        int dp2 = Integer.MIN_VALUE;
        int dp3 = Integer.MAX_VALUE;
        int dp4 = Integer.MIN_VALUE;

        for (int i = 1; i < prices.length; i++) {
            dp1 = Math.min(dp1, prices[i]);
            dp2 = Math.max(dp2, prices[i] - dp1);
            dp3 = Math.min(dp3, dp2 - prices[i]);
            dp4 = Math.max(dp4, prices[i] - dp3);
        }
        return Math.max(dp2, dp4);

    }
}
