package com.qinghua.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;

public class Q76 {
    // 滑动窗口
    // 一直往右滑，直到包含全部的t,此时可能左边可能有很多不需要的元素，开始从左边缩减窗口
    // 每次都记录窗口的大小和两个指针的下标，取最小的长度
    public static String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        // 存放窗口中的数据
        ArrayList<Character> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        String res = "";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
            while (check(list, map)) {//如果全都包含了，那就开始从左缩减窗口
                if (list.size() < min) {
                    min = list.size();
                    for (Character character : list) {
                        builder.append(character);
                    }
                    res = builder.toString();
                    builder.setLength(0);
                }
                list.remove(0);
            }
        }
        return res;
    }

    public static boolean check(ArrayList<Character> list, HashMap<Character, Integer> map) {

        HashMap<Character, Integer> map2 = new HashMap<>();
        map2.clear();
        for (Character c : list) {
            if (map2.containsKey(c)) {
                map2.put(c, map2.get(c) + 1);
            } else {
                map2.put(c, 1);
            }
        }
        for (Character c : map.keySet()) {
            if (!map2.containsKey(c) || map.get(c) > map2.get(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }

}