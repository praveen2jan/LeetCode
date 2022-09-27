package Easy;

public class RunningSumOf1DArray {

    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int []res = new int[n];
        for(int i = 0 ; i< n; i++) {
            sum += nums[i];
            res[i] = sum;
        }
        return res;
    }

    public int[] runningSum2(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}
