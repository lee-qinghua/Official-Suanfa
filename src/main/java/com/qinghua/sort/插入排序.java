package com.qinghua.sort;

import java.util.Arrays;

//思路
//第一步：让前两个元素排序
//第二步：把前两个元素看成一个有序的数组，让第三个元素找到自己的位置进行插入
public class 插入排序 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 78, 0};
        method(arr);
    }

    public static void method(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insertValue = arr[i];
            int insertIndex = i - 1;
            while (insertIndex >= 0 && insertValue < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex -= 1;
            }
            arr[insertIndex + 1] = insertValue;
        }
        System.out.println(Arrays.toString(arr));
    }

    public void method1(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int insertValue = arr[i];
            int insertIndex = i - 1;
            while (insertIndex >= 0 && insertValue < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex + 1] = insertValue;
        }
    }
}
