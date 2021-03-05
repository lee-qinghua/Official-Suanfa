package com.qinghua.leetcode.medium;

public class Q5 {
    // 暴力法 超出时间范围
    public static String longestPalindrome(String s) {
        if (s.length() == 1) {
            return String.valueOf(s.charAt(0));
        }

        int max = Integer.MIN_VALUE;
        String res = "";
        StringBuffer buffer = new StringBuffer(s);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (ishuiwen(buffer.substring(i, j + 1))) {
                    if (j - i + 1 > max) {
                        max = j - i + 1;
                        res = buffer.substring(i, j + 1);
                    }
                }
            }
        }
        return res;
    }

    public static boolean ishuiwen(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("ac"));
    }
}
