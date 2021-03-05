package com.qinghua.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Q290 {
    public static boolean wordPattern(String pattern, String s) {
        char[] array = pattern.toCharArray();
        String[] arr2 = s.split(" ");
        if (array.length != arr2.length) return false;
        Map<String, String> map = new HashMap<>();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(Character.toString(array[i])) && !map.containsKey(arr2[i] + "_")) {
                map.put(Character.toString(array[i]), arr2[i]);
                map.put(arr2[i] + "_", Character.toString(array[i]));
            } else {
                if (!map.containsKey(Character.toString(array[i]))) return false;
                if (!map.get(Character.toString(array[i])).equals(arr2[i])) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "cat dog dog cat"));

    }
}
