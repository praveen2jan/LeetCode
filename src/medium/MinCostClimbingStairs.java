package medium;

import static java.lang.Math.min;

public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int []cost) {
        int n = cost.length;
        int first = cost[0];
        int second = cost[1];

        if(n<=2) {
            return min(first, second);
        }

        for(int i =2;i<n;i++){
            int cur = cost[i] + min(first, second);
            first = second;
            second = cur;
        }

        return Math.min(first, second);
    }
}
