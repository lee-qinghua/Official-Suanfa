package com.qinghua.lianxi;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class 有效括号 {
    private static final Map<Character, Character> map = new HashMap<Character, Character>() {{
        put('{', '}');
        put('[', ']');
        put('(', ')');
        put('?', '?');
    }};

    public boolean isValid(String s) {
        if (s.length() > 0 && !map.containsKey(s.charAt(0))) return false;
        int a = 0;
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            a = a ^ array[i];
        }
        if (a != 0) {
            return false;
        } else {
            return true;
        }
    }
}