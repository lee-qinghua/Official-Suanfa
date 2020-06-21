package com.qinghua.sort;

import java.util.jar.JarEntry;

//基本思路
//第一次从arr[0]到arr[length-1]中找最小值，与arr[0]交换
//第二次从arr[1]到arr[length-1]中找最小值，与arr[1]交换
//第二次从arr[2]到arr[length-1]中找最小值，与arr[2]交换
public class 选择排序 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 78, 9, 5, 68, 324, 4, 67, 9, 0};
        method(arr);
    }

    public static void method(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int minValue = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = minValue;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
