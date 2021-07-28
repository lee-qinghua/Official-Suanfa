package com.qinghua.leetcode.medium;

import java.rmi.ConnectIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q90 {
    private List<List<Integer>> ans;
    private List<Integer> path;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ans = new ArrayList<>();
        path = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;

        // 使用一个数组来标记哪些被使用过了
        boolean[] usesd = new boolean[n];

        //开始回溯
        backtrace(nums, 0, usesd, n);
        return ans;
    }

    private void backtrace(int[] nums, int start, boolean[] used, int n) {
        ans.add(new ArrayList<>(path));

        for (int i = start; i < n; i++) {
            // 当前元素和前一个元素相等，并且前一个元素没有被引用，说明同一个元素在当前层已经被使用过
            if (i > 0 && nums[i - 1] == nums[i] && !used[i - 1]) continue;
            used[i] = true;
            path.add(nums[i]);
            backtrace(nums, i + 1, used, start+1); // 向下一个递归




        }

    }
}
