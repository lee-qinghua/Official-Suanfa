package com.qinghua.sort;

import java.util.Arrays;

//改良版的插入排序
//https://www.bilibili.com/video/BV1E4411H73v?p=63
public class 希尔排序 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 2, 9, 0, 3, 1, 7, 8};
        method(arr);
        System.out.println(Arrays.toString(arr));
    }

    //交换法
    public static void method(int[] arr) {
        int split = arr.length / 2;
        while (split != 0) {
            for (int i = 0; i + split < arr.length; i++) {
                if (arr[i] > arr[i + split]) {
                    int temp = arr[i];
                    arr[i] = arr[i + split];
                    arr[i + split] = temp;
                }
            }
            split = split / 2;
        }
    }

    //移位法
//    public static void method1(int[] arr) {
//        int split = arr.length / 2;
//        while (split != 0) {
//            for (int i = 0; i + split < arr.length; i++) {
//                if (arr[i] > arr[i + split]) {
//
//                    int temp = arr[i];
//                    arr[i] = arr[i + split];
//                    arr[i + split] = temp;
//                }
//            }
//            split = split / 2;
//        }
//    }
}
