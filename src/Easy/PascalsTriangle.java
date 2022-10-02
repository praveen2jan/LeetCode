package Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> allRows = new ArrayList<>();

        for(int i = 0 ; i<numRows; i++ ) {
            List<Integer> row = new ArrayList<>();

            for(int j =0;j<i+1;j++) {
                if(j==0 ||j==i) {
                    row.add(0);
                } else {
                    int a = allRows.get(i-1).get(j-1);
                    int b = allRows.get(i-1).get(j);
                    row.add(a+b);
                }

            }
            allRows.add(row);
        }

        return allRows;
    }
}
