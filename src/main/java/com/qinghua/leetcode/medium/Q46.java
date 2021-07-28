package com.qinghua.leetcode.medium;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Q46 {
    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        ArrayList<List<Integer>> res = new ArrayList<>();
        if (len == 0) return res;

        // 一个存放路径的栈
        Deque<Integer> path = new ArrayDeque<>();
        boolean[] used = new boolean[len];
        dfs(nums, len, path, 0, used, res);
        return res;
    }

    private void dfs(int[] nums, int len, Deque<Integer> path, int depth, boolean[] used, ArrayList<List<Integer>> res) {
        // 遍历到了最深的深度
        if (depth == len) {
            res.add(new ArrayList<>(path));
            return;
        }

        //开始遍历
        for (int i = 0; i < len; i++) {
            if (used[i]) continue;
            used[i] = true;
            path.addLast(nums[i]);
            dfs(nums, len, path, depth + 1, used, res);
            path.removeLast();
            used[i] = false;
        }
    }
}
