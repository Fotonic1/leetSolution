public class P1248 {
    public int numberOfSubarrays(int[] nums, int k) {
        int res = 0;
        int odd = 0, l = 0, g = 0;


        for (int r = 0; r < nums.length; r++) {
            odd += nums[r] % 2;

            if (odd == k) g = 0;
            while (odd == k) {
                odd -= nums[l++] % 2;
                g++;
            }

            res += g;
        }

        return res;
    }
}
