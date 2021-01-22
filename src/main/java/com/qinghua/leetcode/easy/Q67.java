package com.qinghua.leetcode.easy;

/**
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 * <p>
 * 输入为 非空 字符串且只包含数字 1 和 0。
 * <p>
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * <p>
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 */
public class Q67 {

    // char 类型的字符串相加减 会自动转换成对应的ascii值进行相加减
    public static void main(String[] args) {
//        String a = "101";
//        System.out.println('1' - '3');
//        System.out.println('1' - '0');
//        System.out.println('0' - '1');
        System.out.println(addBinary("11", "1"));
    }

    // 这样 如果字符串长度过长 会超出int范围
    public String addBinary1(String a, String b) {
        int sum = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        return Integer.toBinaryString(sum);
    }

    //
    public static String addBinary(String a, String b) {
        StringBuffer buffer = new StringBuffer();
        int n = Math.max(a.length(), b.length()), carry = 0;

        for (int i = 0; i < n; ++i) {
            carry += i < a.length() ? (a.charAt(a.length() - i - 1) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - i - 1) - '0') : 0;
            buffer.append((char) (carry % 2 + '0'));
            carry /= 2;
        }

        if (carry > 0) {
            buffer.append("1");
        }
        return buffer.reverse().toString();
    }


}
