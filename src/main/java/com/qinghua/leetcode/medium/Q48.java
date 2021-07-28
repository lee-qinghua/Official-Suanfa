package com.qinghua.leetcode.medium;

public class Q48 {

    // 先上下交换 再对角线交换
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        // 上下交换
        for (int i = 0; i < matrix.length / 2; i++) {
            int[] tmp = matrix[i];
            matrix[i] = matrix[length - i - 1];
            matrix[length - i - 1] = tmp;
        }

        // 对角线交换
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
}
