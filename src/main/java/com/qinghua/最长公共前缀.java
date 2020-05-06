package com.qinghua;

public class 最长公共前缀 {
    public static void main(String[] args) {

        String[] strs = new String[]{"flower", "flow", "flight"};
        String s = longestCommonPrefix(strs);
        System.out.println(s);

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String pre = strs[0];
        for (String str : strs) {
            while (str.indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
                if (pre.isEmpty()) return "";
            }
        }
        return pre;
    }

}
