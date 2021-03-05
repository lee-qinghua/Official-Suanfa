package com.qinghua.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q326 {
    public boolean isPowerOfThree(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        if (n % 3 == 0) {
            return isPowerOfThree(n / 3);
        }
        return false;
    }

    public boolean isPowerOfThree2(int n) {
        if (n < 0) return false;

        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }


    public boolean isPowerOfFour(int n) {
        int maxcount = 15;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 1; i <= 15; i++) {
            list.add(list.get(i - 1) * 4);
        }
        return list.contains(n);
    }
}
