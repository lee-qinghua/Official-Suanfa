package com.qinghua.lianxi;

import java.util.Arrays;

public class 加1 {
    public static void main(String[] args) {
        System.out.println(10/10);
        int[] ints = {9, 9};
        System.out.println(Arrays.toString(plusOne2(ints)));
    }

    public static int[] plusOne2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            int value = digits[i] + 1;
            digits[i] = value % 10;
            int i1 = value / 10;
            if (i1 != 1) return digits;
        }
        int[] ints = new int[digits.length + 1];
        ints[0] = 1;
        return ints;
    }

    public static int[] plusOne(int[] digits) {
        int digit = digits[digits.length - 1];
        int count = 0;
        if (digit == 9) {
            count++;
            for (int i = digits.length - 2; i >= 0; i--) {
                if (digits[i] == 9) {
                    count++;
                } else {
                    break;
                }
            }
        }
        if (count == 0) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        } else if (count > 0 && count < digits.length) {
            digits[digits.length - count - 1] = digits[digits.length - count - 1] + 1;
            for (int i = digits.length - count; i < digits.length; i++) {
                digits[i] = 0;
            }
            return digits;
        } else if (count == digits.length) {
            int[] ints = new int[digits.length + 1];
            ints[0] = 1;
            for (int i = 1; i < ints.length; i++) {
                ints[i] = 0;
            }
            return ints;
        }
        return null;
    }
}
