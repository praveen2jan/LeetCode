package Easy;

public class SearchInsertPoint {

    public static void main(String[] args) {

        int nums[] = {1,3,5,6};
        int target = 7;

        System.out.println(searchInsertPoint(nums, target));
    }

    private static int searchInsertPoint(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;
        while(left<=right) {
            int mid = left + (right-left)/2;
            if(nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                right = mid-1;
            else
                left = mid+1;
        }
        return left;
    }
}
