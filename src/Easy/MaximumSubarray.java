package Easy;

public class MaximumSubarray {

    public static void main(String[] args) {

        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maximaySubarray(nums));
    }

    private static int maximaySubarray(int[] nums) {
        int max = nums[0];
        int maxSoFar = max;
        for(int i =1;i<nums.length;i++){
            max = Math.max(nums[i], max+nums[i]);
            maxSoFar = Math.max(max, maxSoFar);
        }
        return maxSoFar;
    }
}
