package com.qinghua.leetcode.easy;

public class Q292 {
    // 当最后剩下4个石头 无论如何都是输
    public boolean canWinNim(int n) {
        return n % 4 == 0;
    }
}
