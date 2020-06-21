package com.qinghua.sort;

public class 冒泡排序 {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 5, 78, 9, 5, 68, 324, 4, 67, 9, 0};
        int[] arr = {1, -1, 5,6};
        method(arr);
    }

    //思路就是让每一个数和后面的数做对比，从小到大排序
    //时间复杂度为 n`2
    public static void method(int[] arr) {
        boolean flage = false;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            count++;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    flage = true;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if (flage) {
                flage = false;
            } else {
                //如果没有发生交换，那就说明后面的已经排好序了就不需要再继续运行了
                break;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println(count);
    }
}
