package com.qinghua.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q345 {
    public String reverseVowels(String s) {
        char[] array = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!list.contains(s.charAt(left))) {
                left++;
                continue;
            }
            if (!list.contains(s.charAt(right))) {
                right--;
                continue;
            }
            // 交换两个指针的位置
            char tmp = s.charAt(left);
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
        return String.valueOf(array);
    }
}
