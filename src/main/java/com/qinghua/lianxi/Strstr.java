package com.qinghua.lianxi;

public class Strstr {
    public static void main(String[] args) {
        String a = "abcdqwe";
        System.out.println(a.substring(0, 3));
        System.out.println("test");
    }

    public int strStr(String haystack, String needle) {
        if ("".equals(haystack) || "".equals(needle) || needle == null || haystack == null) return -1;
            int big = haystack.length();
        int small = needle.length();
        if (small > big) return -1;
        for (int i = 0; i < big - small + 1; i++) {
            if (haystack.substring(i, i + small).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
