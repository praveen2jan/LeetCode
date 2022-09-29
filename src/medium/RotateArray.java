package medium;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5,6,7};
        int k = 3;

        rotateArray(nums, k);

        System.out.println(Arrays.toString(nums));
    }

//    1 2 3 4 5 6 7
//      0 1 2 3 4 5 6
//
//    reverse (0,3)
//
//    4 3 2 1 7 6 5
//
//    5 6 7 1 2 3 4

    private static void rotateArray(int[] nums, int k) {

        if(nums.length <2)
            return;

        k = k%nums.length;

        reverse(nums, 0, nums.length-k-1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0,nums.length-1);

    }

    private static void reverse(int[] nums, int left, int right) {

        while(left<=right) {
            var temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }
}
