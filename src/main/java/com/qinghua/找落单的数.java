package com.qinghua;
//136. 只出现一次的数字
//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//
//说明：
//
//你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
//
//示例 1:
//
//输入: [2,2,1]
//输出: 1
//示例 2:
//
//输入: [4,1,2,1,2]
//输出: 4

public class 找落单的数 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 3, 4, 2};
        int i = singleNumber(arr);
        System.out.println(i);
    }

    /**
     * 时间复杂度为O(N)
     * XOR算法，下面四种基础计算。并且有记忆就是会把多个不相同的元素存起来知道遇到相同的元素就会抵消掉。
     * 0^1=1
     * 0^0=0
     * 1^1=0
     * 1^0=1
     */
    public static int singleNumber(int[] nums) {
        int num = 0;
        for (int i : nums) {
            num = num ^ i;
        }
        return num;
    }

}
