package com.qinghua.leetcode.easy;

public class Q231 {
    public boolean isPowerOfTwo(int n) {
        if (n % 2 != 0) return false;

        while (n != 1 && n > 0) {
            if (n % 2 == 1) return false;
            n /= 2;
        }
        if (n == 1) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isPowerOfTwo2(int n) {
        if (n == 0) return false;
        while (n % 2 == 0) n /= 2;
        return n == 1;
    }
}
