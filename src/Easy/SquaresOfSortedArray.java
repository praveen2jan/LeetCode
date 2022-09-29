package Easy;

import java.util.Arrays;
import java.util.Map;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int nums[] = {-1};
        nums = sortedSquares(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static int[] sortedSquares(int[] nums) {
        int []res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int i = nums.length-1;
        while(left<=right) {
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                res[i] = nums[left] * nums[left];
                i--;
                left++;
            }else {
                res[i] = nums[right] * nums[right];
                i--;
                right--;
            }
        }
        return res;
    }
}
