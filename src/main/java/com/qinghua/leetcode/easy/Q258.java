package com.qinghua.leetcode.easy;

public class Q258 {
    public int addDigits(int num) {
        if (num < 10) return num;
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num /= 10;
        }
        return addDigits(sum);
    }

}
