package Easy;

public class ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        if(m*n!=r*c)
            return mat;

        int[][] res = new int[r][c];

        int resX = 0;
        int resY = 0;

        for(int i =0;i<m;i++) {
            for(int j =0;j<n;j++) {
                res[resX][resY] = mat[i][j];
                resY++;
                if(resY==c) {
                    resY =0;
                    resX++;
                }
            }
        }
        return res;

    }
}
