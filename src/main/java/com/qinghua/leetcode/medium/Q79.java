package com.qinghua.leetcode.medium;

public class Q79 {
    public boolean exist(char[][] board, String word) {
        // todo 方法1
//        int h = board.length, w = board[0].length;
//        boolean[][] visited = new boolean[h][w];
//
//        for (int i = 0; i < h; i++) {
//            for (int j = 0; j < w; j++) {
//                boolean check = check(board, visited, i, j, word, 0);
//                if (check) return true;
//            }
//        }
//        return false;
        // todo 方法2
        int h = board.length, w = board[0].length;
        boolean[][] visited = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                boolean check = dfs(board, word, i, j, 0);
                if (check) return true;
            }
        }
        return false;
    }

    public boolean check(char[][] board, boolean[][] visited, int i, int j, String s, int k) {
        if (board[i][j] != s.charAt(k)) {
            return false;
        } else if (k == s.length() - 1) {
            return true;
        }
        visited[i][j] = true;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean result = false;
        for (int[] dir : directions) {
            int newi = i + dir[0], newj = j + dir[1];
            if (newi >= 0 && newi < board.length && newj >= 0 && newj < board[0].length) {
                if (!visited[newi][newj]) {
                    boolean flag = check(board, visited, newi, newj, s, k + 1);
                    if (flag) {
                        result = true;
                        break;
                    }
                }
            }
        }
        visited[i][j] = false;
        return result;
    }

    public boolean dfs(char[][] board, String word, int i, int j, int k) {
        if (k == word.length()) return true;
        // 边界限制
        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length) return false;

        if (word.charAt(k) != board[i][j]) {
            return false;
        }

        // 防止重复搜索，给这个位置设置成一个非字母，绝对不等于word的词
        char c = board[i][j];
        board[i][j] = '0';
        boolean flag = dfs(board, word, i + 1, j, k + 1) ||
                dfs(board, word, i - 1, j, k + 1) ||
                dfs(board, word, i, j + 1, k + 1) ||
                dfs(board, word, i, j - 1, k + 1);
        board[i][j] = c;
        return flag;
    }

}
