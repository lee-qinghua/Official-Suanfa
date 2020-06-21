package com.qinghua.手写;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6, 7};
        int[] arr1 = {3, 5, 7, 1, 2};
        List<Integer> list = method5(arr, 5);
        hellSort(arr1);
//        System.out.println(1);
    }

    public static void hellSort(int[] arr) {
        //对插入排序的优化，比如 2345 1 ，1插入的时候要经过好几次计算
        int step = arr.length / 2;
        while (step != 0) {
            for (int i = 0; i < arr.length - step; i++) {
                if (arr[i + step] < arr[i]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + step];
                    arr[i + step] = tmp;
                }
            }
            step /= 2;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void insertSort(int[] arr) {
        //第一次把arr[0] 看成有序数组 arr[1]插入
        //第二次把arr[0]-arr[1] 看成有序数组 arr[2]插入

        for (int i = 1; i < arr.length; i++) {
            int insertValue = arr[i];
            int insertIndex = i - 1;
            while (insertIndex >= 0 && arr[insertIndex] > insertValue) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex + 1] = insertValue;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        //每次都是找最小的元素，进行置换
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
        System.out.println(Arrays.toString(arr));
    }


    public static void bubbleSort(int[] arr) {
        //冒泡排序  每个元素跟后面的元素相比，交换位置
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

    public static List<Integer> method5(int[] arr, int target) {
        List<Integer> list = new ArrayList<>();
        if (arr == null) return list;

        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                list.add(mid);
                int a = mid - 1;
                int b = mid + 1;
                while (a >= 0) {
                    if (arr[a] == target) {
                        list.add(a);
                        a--;
                    } else {
                        break;
                    }
                }

                while (b <= arr.length - 1) {
                    if (arr[b] == target) {
                        list.add(b);
                        b++;
                    } else {
                        break;
                    }
                }
                break;
            }
        }
        return list;
    }

    public static List<Integer> method3(int[] arr, int target) {
        List<Integer> list = new ArrayList<>();
        if (arr == null) return list;
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                list.add(mid);
                int a = mid - 1;
                int b = mid + 1;
                while (a >= 0) {
                    if (arr[a] == target) {
                        list.add(a);
                        a--;
                    } else {
                        break;
                    }
                }
                while (b <= arr.length - 1) {
                    if (arr[b] == target) {
                        list.add(b);
                        b++;
                    } else {
                        break;
                    }
                }
                break;
            }
        }
        return list;
    }


    public static List<Integer> method(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if (arr == null) return list;
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                list.add(mid);
                int a = mid;
                int b = mid;
                while (a - 1 >= 0) {
                    if (arr[a - 1] == target) {
                        list.add(a - 1);
                        a -= 1;
                    } else {
                        break;
                    }
                }
                while (b + 1 <= arr.length - 1) {
                    if (arr[b + 1] == target) {
                        list.add(b + 1);
                        b += 1;
                    } else {
                        break;
                    }
                }
                return list;
            }
        }
        return list;
    }

    public static int method1(int[] arr, int target) {
        if (arr == null) return -1;
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (target > arr[mid]) {
                left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
