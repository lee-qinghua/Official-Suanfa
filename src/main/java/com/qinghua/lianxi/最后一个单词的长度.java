package com.qinghua.lianxi;

public class 最后一个单词的长度 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("sda sadasd sdasdasdasda "));
    }

    public static int lengthOfLastWord(String s) {
        if (s.equals("")) return 0;
        String[] strings = s.split(" ");
        if (strings.length > 0) {
            int length = strings[strings.length - 1].length();
            return length;
        } else {
            return 0;
        }
    }
}
