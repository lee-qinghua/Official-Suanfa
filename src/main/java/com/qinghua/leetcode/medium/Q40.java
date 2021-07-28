package com.qinghua.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q40 {
    private static List<List<Integer>> res;

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, new ArrayList<Integer>(), 0, 0);
        return res;
    }

    public static void dfs(int[] candidates, int target, List<Integer> path, int cur, int start) {

        if (cur > target) return;
        if (cur == target) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if(i > start && candidates[i] == candidates[i - 1]) continue;
            path.add(candidates[i]);
            dfs(candidates, target, path, cur + candidates[i], i + 1);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
    }
}
