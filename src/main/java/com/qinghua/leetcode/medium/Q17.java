package com.qinghua.leetcode.medium;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q17 {
    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if ("".equals(digits)) return list;

        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> res = new ArrayList<>();
        char[] array = digits.toCharArray();
        for (char c : array) {
            String s = map.get(c);
            res = mix(res, s);
        }
        return res;
    }

    public static List<String> mix(List<String> list, String s) {
        ArrayList<String> res = new ArrayList<>();
        if (list.size()==0) {
            char[] array = s.toCharArray();
            for (char c : array) {
                res.add(String.valueOf(c));
            }
        } else {
            for (String s1 : list) {
                for (char c : s.toCharArray()) {
                    res.add(s1 + c);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
