package com.qinghua.lianxi;

public class 股票最大利润 {
    public static void main(String[] args) {
        int[] ints = {7, 1, 5, 3, 0, 6, 4};
        Solution solution = new Solution();
        int i = solution.maxProfit(ints);
        System.out.println(i);
    }

    static class Solution {
        //[7,1,5,3,6,4]
        public int maxProfit(int[] prices) {
            int min = Integer.MAX_VALUE;
            int max = 0;
            for (int price : prices) {
                min = Math.min(price, min);
                max = Math.max(price - min, max);
            }
            return max;
        }
    }
}
