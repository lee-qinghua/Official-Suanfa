package com.qinghua.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[3,2,3]
 * 输出：3
 * 示例 2：
 * <p>
 * 输入：[2,2,1,1,1,2,2]
 * 输出：2
 *  
 * <p>
 * 进阶：
 * <p>
 * 尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
 */
public class Q169 {
    // 暴力法
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            Integer value = map.get(num);
            if (value == null) {
                map.put(num, 1);
            } else {
                map.put(num, value + 1);
            }
        }

        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            if (map.get(key) > (nums.length / 2)) {
                return key;
            }
        }
        return 0;
    }

    // 排序，出现次数> n/2 排序后， n/2肯定是这个数
    public int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }


    // Boyer-Moore 算法
    // 设置重数为第一个元素，count初始值为0，设置众数之后加1，遍历集合
    // x 如果x和众数不一样，count-1,否则加1。当count变为0时，设置当前元素x为众数。
    public int majorityElement3(int[] nums) {
        int res = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != res) {
                count -= 1;
                if (count == 0) {
                    res = nums[i];
                    count = 1;
                }
            } else {
                count++;
            }
        }
        return res;
    }

}
