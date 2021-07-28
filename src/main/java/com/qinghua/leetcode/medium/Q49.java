package com.qinghua.leetcode.medium;


import java.util.*;

public class Q49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> res = map.get(key);
            if (res == null) {
                ArrayList<String> list1 = new ArrayList<>();
                list1.add(str);
                map.put(key, list1);
            } else {
                res.add(str);
            }
        }
        return new ArrayList<>(map.values());
    }

}
