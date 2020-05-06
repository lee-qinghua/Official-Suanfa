package com.qinghua;

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

        LinkedList<Character> stack = new LinkedList<Character>();
        stack.add('?');
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.addLast(c);
            } else if (map.get(stack.removeLast()) != c) {
                return false;
            }
        }
        //都抵消完后 看是否只剩下一个问号 如果是就为true
        return stack.size() == 1;
    }
}