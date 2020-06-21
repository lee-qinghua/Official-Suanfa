package com.qinghua.xuexi.chapter6;

public class Maze {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //设置挡板
        map[3][1] = 1;
        map[3][2] = 1;

        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }

        for (int[] ints : map) {
            for (int anInt : ints) {
                System.out.print(anInt + "    ");
            }
            System.out.println();
        }
        System.out.println("===========================================");
        method(map, 1, 1);
        for (int[] ints : map) {
            for (int anInt : ints) {
                System.out.print(anInt + "    ");
            }
            System.out.println();
        }
    }

    //使用地归回溯给小球找路
    //如果小球能找到map[6][5]位置，则能通
    //约定：map[i][j] 为0表示没有走过，1表示墙，2表示能走通，3表示走不通
    //订一个策略走的顺序是 下->右->上->左

    /**
     * @param map 地图
     * @param i   开始位置横坐标
     * @param j   开始位置纵坐标
     */
    public static boolean method(int[][] map, int i, int j) {
        if (map[6][5] == 2) return true;//说明走到了map[6][5]并给他设置了2
        if (map[i][j] == 0) {
            map[i][j] = 2;//先假设能走通设置为2
            if (method(map, i + 1, j)) {
                return true;
            } else if (method(map, i, j + 1)) {
                return true;
            } else if (method(map, i - 1, j)) {
                return true;
            } else if (method(map, i, j - 1)) {
                return true;
            } else {
                map[i][j] = 3;
                return false;
            }
        } else {
            return false;
        }
    }
}
