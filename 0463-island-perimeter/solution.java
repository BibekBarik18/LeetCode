class Solution {
    public int islandPerimeter(int[][] grid) {
        int rl=grid.length;
        int cl=grid[0].length;
        int c=0;
        for(int i=0;i<rl;i++)
        {
            for(int j=0;j<cl;j++)
            {
                if(grid[i][j]==1)
                {
                if(i>0 && grid[i-1][j]==0 || i==0)
                c++;
                if(j<cl-1 && grid[i][j+1]==0 || j==cl-1)
                c++;
                if(i<rl-1 && grid[i+1][j]==0 || i==rl-1)
                c++;
                if(j>0 && grid[i][j-1]==0 || j==0)
                c++;
                }
            }
        }
        return c;
    }
}
