package com.qinghua.手写;

import java.util.Arrays;

public class B {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4, 4};
        int[] result = method(digits, 8);
        System.out.println(Arrays.toString(result));
    }

    public static int[] method(int[] numbers, int target) {
        int leftIndex = 0;
        int rightIndex = numbers.length - 1;

        while (leftIndex < rightIndex) {
            int result = numbers[leftIndex] + numbers[rightIndex];
            if (result == target) {
                return new int[]{numbers[leftIndex],numbers[rightIndex]};
            } else if (result < target) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }
        return null;
    }
}
