package Easy;

public class NthTribonacciProblem {

    public static void main(String[] args) {
        System.out.println(new NthTribonacciProblem().tribonacci(25));
    }

    public int tribonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 1;

        if(n==0)
            return a;
        else if(n==1)
            return b;
        else if (n==2)
            return c;

        int res = 0;

        for(int i =0 ; i<n-2;i++){
            res = a+b+c;
            a = b;
            b = c;
            c = res;
        }

        return res;
    }
}
