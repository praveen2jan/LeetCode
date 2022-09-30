package Easy;

public class FloodFill {

    public int[][] floodfill(int [][]image, int sr, int sc, int color) {

        if(image[sr][sc] == color)
            return image;

        fill(image, sr, sc, image[sr][sc], color);

        return image;
    }

    private void fill(int[][] image, int i, int j, int color, int newColor) {
        if( i<0 || j<0 || i>=image.length || j>=image[i].length || image[i][j]!=color)
            return;

        image[i][j] = newColor;
        fill(image, i-1, j, color, newColor);
        fill(image, i+1, j, color, newColor);
        fill(image, i, j+1, color, newColor);
        fill(image, i, j-1, color, newColor);
    }
}
