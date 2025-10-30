import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res = new HashSet();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i1 = 0;
        int i2 = 0;

        while (i1 < nums1.length && i2 < nums2.length){
            if (nums1[i1] > nums2[i2]) {
                i2++;
            } else if (nums1[i1] < nums2[i2]) {
                i1++;
            } else {
                res.add(nums1[i1]);
                i1++;
                i2++;
            }
        }

        int[] result = new int[res.size()];
        int i = 0;

        for (Integer r : res) {
            result[i++] = r;
        }

        return result;
    }
}
