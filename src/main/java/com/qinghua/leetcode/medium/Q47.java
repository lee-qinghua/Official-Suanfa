package com.qinghua.leetcode.medium;

import java.util.*;

public class Q47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        boolean[] flag = new boolean[nums.length];
        Arrays.sort(nums);
        dfs(res, nums, flag, new ArrayList<Integer>());
        return res;
    }

    private void dfs(ArrayList<List<Integer>> res, int[] nums, boolean[] flag, List<Integer> path) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (flag[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && flag[i - 1]) continue;

            path.add(nums[i]);
            flag[i] = true;
            dfs(res, nums, flag, path);
            // 状态重置
            flag[i] = false;
            path.remove(path.size() - 1);
        }
    }

//    public static void main(String[] args) {
//        permuteUnique(new int[]{1, 2, 2});
//    }
}
