package Easy;

import java.util.HashMap;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int []nums = {1,2,3, 1};

        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for( int num : nums) {
            if(map.containsKey(num))
                return true;
            map.put(num, num);
        }
        return false;
    }
}
