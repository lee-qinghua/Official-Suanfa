package com.qinghua;

public class 搜索矩阵 {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;

        System.out.println(a / 10);
    }

    public boolean method(int[][] matrix, int target) {
        if (matrix == null) return false;
        int i = 0;
        int j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                i += 1;
            } else {
                j -= 1;
            }
        }
        return false;
    }

    class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            } else {
                char[] array = Integer.toString(x).toCharArray();
                for (int i = 0; i < array.length / 2; i++) {
                    if (array[i] != array[array.length - 1 - i]) {
                        return false;
                    }
                }
                return true;
            }
        }
    }


}
