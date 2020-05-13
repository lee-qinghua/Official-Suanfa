package com.qinghua.lianxi;

import java.util.ArrayList;
import java.util.List;

public class 罗马数字 {
    public static void main(String[] args) {

    }

    class Solution {
        public int romanToInt(String s) {
            char[] array = s.toCharArray();
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                int first = getValue(array[i]);
                if (i < array.length - 1) {
                    int second = getValue(array[i + 1]);
                    if (first < second) {//右边减左边
                        sum += (second - first);
                        i++;
                    } else {
                        sum += first;
                    }
                } else {
                    sum += first;
                }
            }
            return sum;
        }



        public int getValue(char s) {
            switch (s) {
                case 'I':
                    return 1;
                case 'V':
                    return 5;
                case 'X':
                    return 10;
                case 'L':
                    return 50;
                case 'C':
                    return 100;
                case 'D':
                    return 500;
                case 'M':
                    return 1000;
                default:
                    return 0;
            }
        }
    }
}
