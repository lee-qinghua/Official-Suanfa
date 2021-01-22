package com.qinghua.leetcode.easy;

//todo 统计所有小于非负整数 n 的质数的数量
public class Q204 {
    public int countPrimes(int n) {
        int cnt = 0;
        for (int i = 2; i < n; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}
