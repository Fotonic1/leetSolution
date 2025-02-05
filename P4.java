import java.util.HashMap;
import java.util.Map;

public class P4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int sumLength = (nums1.length + nums2.length);
        int left = 0;
        int right = nums1.length;
        while (left <= right) {
            int partitionA = left + right / 2;
            int partitionB = (sumLength + 1) / 2 - partitionA;

            int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : nums1[partitionA - 1];
            int minRightA = (partitionA == nums1.length) ? Integer.MAX_VALUE : nums1[partitionA];

            int maxLeftB = (partitionB == 0) ? Integer.MIN_VALUE : nums2[partitionB - 1];
            int minRightB = (partitionB == nums2.length) ? Integer.MAX_VALUE : nums2[partitionB];

            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                if (sumLength % 2 == 0) {
                    return (
                            (Math.max(maxLeftA, maxLeftB) +
                                    Math.min(minRightA, minRightB)) /
                                    2.0
                    );
                } else {
                    return Math.max(maxLeftA, maxLeftB);
                }
            } else if (maxLeftA > minRightB) {
                right--;
            } else {
                left++;
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
        int[] nums3 = {1,2};
        int[] nums4 = {3,4};
        System.out.println(findMedianSortedArrays(nums3, nums4));
    }
}
