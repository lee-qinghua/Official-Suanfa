package com.qinghua.leetcode.easy;

import com.sun.deploy.util.StringUtils;

public class Q125 {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(String s) {
        if (s == null) return false;

        StringBuffer buffer = new StringBuffer();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                char c1 = Character.toUpperCase(c);
                buffer.append(c1);
            }
        }
        String s2 = buffer.toString();
        String s1 = buffer.reverse().toString();

        return s1.equals(s2);
    }


    public boolean isPalindrome2(String s) {
        if (s == null) return false;

        StringBuffer buffer = new StringBuffer();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                char c1 = Character.toUpperCase(c);
                buffer.append(c1);
            }
        }
        String s2 = buffer.toString();
        String s1 = buffer.reverse().toString();

        int length = s.length();
        int left = 0;
        int right = length - 1;

        while (left < right) {
            while (!Character.isLetterOrDigit(s.charAt(left)) && left < right) {
                left++;
            }
            while (!Character.isLetterOrDigit(s.charAt(right)) && right > left) {
                right--;
            }
            char left_char = Character.toLowerCase(s.charAt(left));
            char right_char = Character.toLowerCase(s.charAt(right));
            left++;
            right--;
            if (left_char != right_char) {
                return false;
            }
        }
        return true;
    }
}
