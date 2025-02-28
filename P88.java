public class P88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];

        for (int i = 0; i < m; i++) {
            temp[i] = nums1[i];
        }

        int i1 = 0;
        int i2 = 0;

        while (i1 < m && i2 < n) {
            if (temp[i1] > nums2[i2]) {
                nums1[i1 + i2] = nums2[i2];
                i2++;
            } else {
                nums1[i1 + i2] = temp[i1];
                i1++;
            }
        }
        while (i1 < m) {
            nums1[i1 + i2] = temp[i1];
            i1++;
        }

        while (i2 < n) {
            nums1[i1 + i2] = nums2[i2];
            i2++;
        }
    }
}
