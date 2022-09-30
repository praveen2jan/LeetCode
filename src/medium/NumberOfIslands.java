package medium;

public class NumberOfIslands {

    public int numOfIslands(char [][]grid) {

        int numberOfIslands = 0;

        for(int i =0;i<grid.length;i++) {
            for(int j =0;j<grid[i].length;j++){
                if(grid[i][j] =='1') {
                    numberOfIslands+=count(grid, i, j);
                }
            }
        }

        return  numberOfIslands;
    }

    private int count(char[][] grid, int i, int j) {
        if (i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j]!='1')
            return 0;

        grid[i][j] = '0';

        count(grid, i-1, j);
        count(grid, i+1, j);
        count(grid, i, j-1);
        count(grid, i, j+1);
        return 1;
    }
}
