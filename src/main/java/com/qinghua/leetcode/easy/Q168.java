package com.qinghua.leetcode.easy;

// todo
public class Q168 {
    public static void main(String[] args) {
        String s = convertToTitle(27);
        System.out.println(s);
    }

    public static String convertToTitle(int n) {
        int i = (n - 1) / 26;
        int j = (n - 1) % 26;

        StringBuilder builder = new StringBuilder();

        if (i > 0) {
            builder.append((char) ('A' + i - 1));

            builder.append((char) ('A' + j));

        } else {
            builder.append((char) ('A' + j));
        }
        return builder.toString();
    }
}
