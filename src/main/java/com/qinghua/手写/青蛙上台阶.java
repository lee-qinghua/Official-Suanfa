package com.qinghua.手写;

import java.util.HashMap;

public class 青蛙上台阶 {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        System.out.println(method(50));
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }

    private static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    public static int method(int n) {
        if (n == 1) {
            map.put(1, 1);
            return 1;
        }
        if (n == 2) {
            map.put(2, 2);
            return 2;
        }

        Integer one = map.get(n - 1);
        Integer two = map.get(n - 2);
        if (one == null) {
            one = method(n - 1);
            map.put(n - 1, one);
        }
        if (two == null) {
            two = method(n - 2);
            map.put(n - 2, two);
        }

        return one + two;
//        return method(n - 1) + method(n - 2);
    }
}
