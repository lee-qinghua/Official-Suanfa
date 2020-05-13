package com.qinghua.lianxi;

import java.util.HashMap;
import java.util.Map;

//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
//注意：给定 n 是一个正整数。
public class 爬楼梯 {
    public static void main(String[] args) {
        int count = climbStairs2(50);
        System.out.println(count);
    }

    //时间复杂度为o(2^n) 空间复杂度：O(n)，递归树的深度可以达到 nn 。
    public static int climbStairs1(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        return climbStairs1(n - 1) + climbStairs1(n - 2);
    }

    //方法2 时间复杂度为
    public static int climbStairs2(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        return getCount(n - 1) + getCount(n - 2);
    }

    private static Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    static int getCount(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        } else {
            map.put(n, climbStairs2(n));
            return map.get(n);
        }
    }

}


