package com.qinghua.leetcode.medium;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 */
public class Q77 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (k <= 0 || n < k) return res;

        Deque<Integer> path = new ArrayDeque<>();
        dfs(n, k, 1, path, res);
        return res;

    }

    private void dfs(int n, int k, int begin, Deque<Integer> path, List<List<Integer>> res) {
        // 遍历的终止条件
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }

        // 剪枝操作，当begin开始的元素个数 不足以满足k-path.size()时
        if ((n - begin + 1) < (k - path.size())) {
            return;
        }

        for (int i = begin; i <= n; i++) {
            path.addLast(i);
            // 下一轮搜索，设置的搜索起点要加 1，因为组合数理不允许出现重复的元素
            dfs(n, k, i + 1, path, res);

            // 重点理解这里：深度优先遍历有回头的过程，因此递归之前做了什么，递归之后需要做相同操作的逆向操作
            // 其实就是清理path 在进行下一次尝试之前要把上一次添加的东西去除掉
            path.removeLast();
        }
    }
}
