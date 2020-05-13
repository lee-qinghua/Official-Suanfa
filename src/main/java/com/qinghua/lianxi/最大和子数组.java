package com.qinghua.lianxi;

public class 最大和子数组 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4, -7, 8};
        System.out.println(maxSubArray(arr));
    }

    // [-2,1,-3,4,-1,2,1,-5,4],
    //每次加完结果都跟最大值比较一下取两个中比较大的，这样就保存了上一个大值。然后再加下一轮的大值。
    public static int maxSubArray(int[] nums) {
        int sumPre = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (sum > 0) {
                sum = sum + nums[i];
            } else {
                sum = nums[i];
            }
            sumPre = Math.max(sumPre, sum);
        }
        return sumPre;
    }
}
