class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int maxArea = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // If we find land and it's not visited
                if (grid[i][j] == 1 && !visited[i][j]) {
                    int area = dfs(i, j, grid, visited);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }

    // DFS returns area of this island
    private int dfs(int i, int j, int[][] grid, boolean[][] visited) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) return 0; // out of bounds
        if (grid[i][j] == 0 || visited[i][j]) return 0; // water or already visited

        visited[i][j] = true; // mark current cell as visited

        // Area = 1 (current cell) + area from neighbors
        return 1
            + dfs(i - 1, j, grid, visited) // up
            + dfs(i + 1, j, grid, visited) // down
            + dfs(i, j - 1, grid, visited) // left
            + dfs(i, j + 1, grid, visited); // right
    }
}
