package com.tengdw.LeetCode;

import org.junit.Test;

/**
 * 岛屿的最大面积
 *
 * @author Tengdw t_dw@qq.com
 * @description
 * @date 2019/1/22 16:28
 */
public class LeetCode695 {
    class Solution {
        public int maxAreaOfIsland(int[][] grid) {
            int max = 0;
            for (int i = 0; i < grid.length; i++)
                for (int j = 0; j < grid[i].length; j++)
                    if (grid[i][j] == 1)
                        max = Math.max(max, dfs(grid, i, j));
            return max;
        }

        private int dfs(int[][] grid, int x, int y) {
            if (x >= grid.length || x < 0 || y < 0 || y >= grid[x].length || grid[x][y] == 0)
                return 0;
            grid[x][y] = 0;//防止重复搜索
            return 1 + dfs(grid, x + 1, y) + dfs(grid, x - 1, y) +
                    dfs(grid, x, y + 1) + dfs(grid, x, y - 1);
        }
    }

    @Test
    public void test() {
        int[][] grid = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        int ans = new Solution().maxAreaOfIsland(grid);
        System.out.println(ans);
    }
}
