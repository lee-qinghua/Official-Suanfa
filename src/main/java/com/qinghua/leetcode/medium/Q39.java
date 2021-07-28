package com.qinghua.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Q39 {
    private static List<List<Integer>> res;

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        backtrack(new ArrayList<Integer>(), 0, 0, candidates, target);
        return res;
    }

    private static void backtrack(List<Integer> tmp, int cur, int index, int[] candidates, int target) {
        if (cur > target) return;
        if (cur == target) {
            res.add(new ArrayList<Integer>(tmp));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            tmp.add(candidates[i]);
            backtrack(tmp, cur + candidates[i], i, candidates, target);
            tmp.remove(tmp.size() - 1);
        }

    }

    private static void dfs(List<Integer> path, int cur, int start, int[] candidates, int target) {
        if (cur > target) return;
        if (cur == target) {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            path.add(candidates[i]);
            dfs(path, cur + candidates[i], i, candidates, target);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        combinationSum(new int[]{1, 2, 3}, 6);
    }
}
