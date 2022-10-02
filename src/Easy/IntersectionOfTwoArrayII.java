package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrayII {

    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> commonIntegers = new ArrayList<>();

        for(int n : nums1) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        for(int n : nums2) {
            if(map.containsKey(n) && map.get(n) >0) {
                map.put(n, map.get(n)-1);
                commonIntegers.add(n);
            }
        }

        return commonIntegers.stream().mapToInt(Integer::intValue).toArray();
    }
}
