package Easy;

//https://leetcode.com/problems/find-pivot-index/?envType=study-plan&id=level-1

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindPivotIndex {

    public static void main(String[] args) {
        int input[] = {1,7,3,6,5,6};
        int input2[] = {1,2,3};
        int input3[] = {2,1, -1};
//        System.out.println(pivotIndex(input));
//        System.out.println(pivotIndex(input2));
//        System.out.println(pivotIndex(input3));
        System.out.println(pivotElement(input));
        System.out.println(pivotElement(input2));
        System.out.println(pivotElement(input3));
    }

    private static int pivotIndex(int[] nums) {
        int left[] = new int[nums.length+1];
        int right[] = new int[nums.length+1];

        //precomputation
        left[0] = 0;
        for(int i =1;i<nums.length;i++) {
            left[i] = left[i] + nums[i-1];
        }

        System.out.println(Arrays.toString(left));

        right[0] = 0;
        for(int i = nums.length-2;i>=0;i--) {
            right[i] = right[i] + nums[i+1];
        }

        System.out.println(Arrays.toString(right));

        for(int i =1;i<nums.length;i++){
            if(left[i] == right[i])
                return i-1;
        }
        return -1;
    }

    private static int pivotElement(int[] nums) {
        int leftSum =0;
        int sum =0;
        for(int num : nums)
            sum = sum+ num;
        for (int i =0;i< nums.length;i++) {
            System.out.println("left " + leftSum + " sum - leftSum - nums[i] " + (sum - leftSum - nums[i]));
            if(leftSum == sum - leftSum - nums[i])
                return i;
            leftSum = leftSum + nums[i];
        }
        return -1;
    }
}
