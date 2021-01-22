package com.qinghua.leetcode.easy;

import java.util.HashMap;

/**
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 * <p>
 * 如果 s 中的字符可以按某种映射关系替换得到 t ，那么这两个字符串是同构的。
 * <p>
 * 每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。不同字符不能映射到同一个字符上，相同字符只能映射到同一个字符上，字符可以映射到自己本身。
 */
public class Q205 {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            char value = t.charAt(i);
            if (map.get(key) == null || map.get(value) == null) {
                map.put(key, value);
                map.put(value, key);
            } else if (map.get(key) != null && map.get(value) == null) {
                return false;
            } else if (map.get(key) == null && map.get(value) != null) {
                return false;
            } else if (map.get(key) != null && map.get(value) != null) {
                if (map.get(key) != map.get(value)) {
                    return false;
                }
            }
        }
        return true;

    }
}
