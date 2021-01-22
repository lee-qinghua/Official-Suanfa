package com.qinghua.leetcode.easy;

/**
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * <p>
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * <p>
 * 说明:
 * <p>
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * 示例:
 * <p>
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 */
public class Q167 {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) return null;
        int[] res = new int[2];
        int index1 = 0;
        int index2 = 1;

        while (numbers[index1] * 2 <= target) {
            while (index2 < numbers.length) {
                if (numbers[index1] + numbers[index2] != target) {
                    index2++;
                } else {
                    res[0] = index1 + 1;
                    res[1] = index2 + 1;
                    return res;
                }
            }
            index1++;
        }

        return null;
    }

    public int[] twoSum2(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) return null;
        int[] res = new int[2];
        int index1 = 0;
        int index2 = fun(numbers, target - numbers[index1]);

        // 如果sum>target 右指针左移
        // 如果sum<target 左指针右移

        while (numbers[index1] + numbers[index2] != target) {
            if (numbers[index1] + numbers[index2] > target) {
                index2--;
            } else {
                index1++;
            }
        }
        res[0] = index1 + 1;
        res[1] = index2 + 1;
        return res;
    }

    public int fun(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] < target) {
                left = mid + 1;
            } else if (numbers[mid] > target) {
                right = mid;
            } else {
                return mid;
            }
        }
        return left;
    }

}
