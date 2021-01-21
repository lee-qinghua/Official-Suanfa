package com.qinghua.leetcode;

public class Q121 {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int max_price = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= buy) buy = prices[i];
            if (prices[i] - buy > max_price) max_price = prices[i] - buy;
        }
        return max_price;
    }
}
