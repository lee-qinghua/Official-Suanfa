package com.qinghua.xuexi.chapter3;

public class 稀疏数组 {
    public static void main(String[] args) {
        method1();
    }


    public static void method1() {
        //求出有效数字的个数
        int[][] arr = new int[11][11];
        arr[2][3] = 10;
        arr[5][6] = 20;
        arr[7][8] = 20;
        int sum = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > 0) sum++;
            }
        }
        //创建数组
        int[][] result = new int[sum + 1][3];
        result[0][0] = 11;
        result[0][1] = 11;
        result[0][2] = sum;

        //插入稀疏数组
        int count = 1;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (arr[i][j] != 0) {
                    result[count][0] = i;
                    result[count][1] = j;
                    result[count][2] = arr[i][j];
                    count++;
                }
            }
        }
        for (int[] ints : result) {
            System.out.print(ints[0] + "              ");
            System.out.print(ints[1] + "              ");
            System.out.print(ints[2] + "              ");
            System.out.println();
        }
        System.out.println("===========================================");
        /**
         *  result稀疏数组转二维
         */
        int hang = result[0][0];
        int lie = result[0][1];
        int zong = result[0][2];

        int[][] newErwei = new int[hang][lie];

        for (int i = 1; i <=zong; i++) {
            int a = result[i][0];
            int b = result[i][1];
            int c = result[i][2];
            newErwei[a][b] = c;
        }
        for (int[] ints : newErwei) {
            for (int anInt : ints) {
                System.out.print(anInt+"      ");
            }
            System.out.println();
        }

    }


}
