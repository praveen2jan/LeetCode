package Easy;

public class Convert1DArrayTo2DArray {

    public int[][] contruct2DArray(int[] original, int m , int n) {

        int length= original.length;

        if(length!=m*n) {
            return new int[0][0];
        }

        int[][] res = new int[m][n];

        for(int i =0;i<length;i++) {
            res[i/n][i%n] = original[i];
        }

        return res;
    }
}
