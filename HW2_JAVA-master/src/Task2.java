
//https://leetcode.com/problems/max-area-of-island/ площадь острова = 1 + площадь его соседей.

// Подумайте о том, что два раза заходить не надо в клеточку.
public class Task2 {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    int area = dfs(grid, i, j, 0);
                    if (area > max) {
                        max = area;
                    }
                }
            }
        }

        return max;
    }

    public int dfs(int[][] grid, int i, int j, int area) {
        if (i < 0 || j < 0
                || i >= grid.length || j >= grid[i].length
                || grid[i][j] == 0) {
            return area;
        }

        grid[i][j] = 0;
        area++;
        area = dfs(grid, i - 1, j, area);
        area = dfs(grid, i + 1, j, area);
        area = dfs(grid, i, j + 1, area);
        area = dfs(grid, i, j - 1, area);

        return area;
    }
}
