package com.qinghua.手写;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 56, 7, 1, 4, 5, 8};
        method1(arr);
    }

    //冒泡排序
    public static void method1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    //选择排序
    public static void method2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            int minValue = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                    minValue = arr[j];
                }
            }
            int temp = arr[i];
            arr[i] = minValue;
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
