package Easy;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int []nums1 = {1,2,3,0,0,0};
        int []nums2 = {2,5,6};

        int m = 3;
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int end = nums1.length-1;
        m = m-1;
        n = n-1;
        while(m>=0 && n>=0) {
            if(nums1[m] > nums2[n]) {
                nums1[end] = nums1[m];
                end--;
                m--;
            } else {
                nums1[end] = nums2[n];
                end--;
                n--;
            }
        }
        while(m>=0){
            nums1[end] = nums1[m];
            end--;
            m--;
        }
        while(n>=0){
            nums1[end--] = nums2[n--];
        }
    }
}
