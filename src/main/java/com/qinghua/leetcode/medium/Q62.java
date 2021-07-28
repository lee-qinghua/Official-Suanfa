package com.qinghua.leetcode.medium;

public class Q62 {
    public static int cnt = 0;

    // 深度优先搜索
    public static int uniquePaths(int m, int n) {
        dfs(m, n, 1, 1);
        return cnt;
    }

    // m是宽度 n是高度
    // a+1 往右走  b+1 往下走
    public static void dfs(int m, int n, int a, int b) {
        if (a > m || b > n) return;
        if (a == m && b == n) {
            cnt++;
            return;
        }
        dfs(m, n, a + 1, b);
        dfs(m, n, a, b + 1);
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths2(3, 7));
    }

    // 倒推
    public static int uniquePaths2(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
