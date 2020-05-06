package com.qinghua;

public class 股票最大利润 {
    class Solution {
        //[7,1,5,3,6,4]
        public int maxProfit(int[] prices) {
            int min = Integer.MAX_VALUE;
            int max = 0;
            for (int price : prices) {
                price = Math.min(price, min);
                max = Math.max(price - min, max);
            }
            return max;
        }
    }
}
