import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        if (fresh == 0) return 0;
        int minutes = -1;
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        while (!queue.isEmpty()) {
            int size = queue.size();
            minutes++;
            for (int k = 0; k < size; k++) {
                int[] cell = queue.poll();
                int i = cell[0], j = cell[1];

                for (int[] d : directions) {
                    int ni = i + d[0];
                    int nj = j + d[1];

                    if (ni >= 0 && ni < rows && nj >= 0 && nj < cols && grid[ni][nj] == 1) {
                        grid[ni][nj] = 2;
                        fresh--;
                        queue.offer(new int[]{ni, nj});
                    }
                }
            }
        }
        return (fresh == 0) ? minutes : -1;
    }
}
