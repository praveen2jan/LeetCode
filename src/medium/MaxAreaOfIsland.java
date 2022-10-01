package medium;

public class MaxAreaOfIsland {



    public int maxAreaOfIsland(int [][]grid) {

        int maxArea = 0;

        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[i].length;j++) {
                if(grid[i][j]==1) {
                    maxArea = Math.max(maxArea, fill(grid, i, j));
                }
            }
        }

        return maxArea;
    }

    private int fill(int[][] grid, int i, int j) {

        if(i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j]!=1) {
            return 0;
        }

        grid[i][j] = 0;

        return 1+ fill(grid, i+1, j) + fill(grid, i-1, j) + fill(grid, i, j-1) + fill(grid, i, j+1);
    }
}
