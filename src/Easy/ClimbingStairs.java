package Easy;

public class ClimbingStairs {

    public int climbStairs(int n) {
        int a = 1;
        int b = 1;

        if(n ==1)
            return a;
        else if (n==2)
            return b;

        int res =0;

        for(int i =0;i<n-1;i++) {
            res = a+b;
            a = b;
            b = res;
        }

        return res;
    }
}
