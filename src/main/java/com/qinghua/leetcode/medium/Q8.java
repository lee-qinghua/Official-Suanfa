package com.qinghua.leetcode.medium;

public class Q8 {
    public int myAtoi(String str) {
        str = str.trim();
        if (str.length() == 0) return 0;
        if (Character.isDigit(str.charAt(0)) && str.charAt(0) != '-' && str.charAt(0) != '+') return 0;

        long ans = 0L;
        boolean neg = str.charAt(0) == '-';
        // 第一个字符如果是数字 i=1 是符号i=0
        int i = !Character.isDigit(str.charAt(0)) ? 1 : 0;


        return 0;
    }
}
