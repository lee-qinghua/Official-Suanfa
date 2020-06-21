package com.qinghua.sort;

import java.time.temporal.Temporal;
import java.util.Arrays;

//冒泡排序的进阶
//大致思路就是 找一个数，把比这个数小的放在左边，比这个数大的放在右边
//再继续递归
public class 快速排序 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 8, 2, 9, 4, 0};
        method(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void method(int[] arr, int left, int right) {
        if (arr == null || left > right) return;
        int midValue = arr[left];
        int i = left;
        int j = right;
        while (i != j) {
            while (arr[j] >= midValue && i < j) {
                j--;
            }
            while (arr[i] <= midValue && i < j) {
                i++;
            }
            //进行交换左右两个数据
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        //最后把midValue放到i和j相等的那个下标的位置
        arr[left] = arr[i];
        arr[i] = midValue;
        method(arr, left, i - 1);
        method(arr, i + 1, right);
    }

    public static void quickSort(int arr[], int low, int high) {
        int i = low;
        int j = high;
        if (i > j) return;
        int midValue = arr[low];
        while (i != j) {
            while (arr[j] >= midValue && i < j) {
                j--;
            }
            while (arr[i] <= midValue && i < j) {
                i++;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        arr[low] = arr[i];
        arr[i] = midValue;
        quickSort(arr, low, i - 1);
        quickSort(arr, i + 1, high);
    }
}
