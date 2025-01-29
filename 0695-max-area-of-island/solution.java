class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > 0 ){
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }
        return max;
    }
    private int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }
        
        int fishCount = grid[i][j];
        grid[i][j]=0;

        fishCount += dfs(grid,  i, j + 1);  
        fishCount += dfs(grid,  i + 1, j);  
        fishCount += dfs(grid,  i, j - 1);  
        fishCount += dfs(grid,  i - 1, j); 
        
        return fishCount;
    }
}
