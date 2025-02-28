public class P209 {
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE, l = 0, sum = 0;

        for (int r = 0; r < nums.length; r++) {
            if (target <= nums[r]) return 1;
            sum += nums[r];

            while (l < r && target <= sum) {
                res = Math.min(res, r - l + 1);
                sum -= nums[l++];
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }

    public static void main(String[] args) {
        P209 t = new P209();
        System.out.println(t.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }
}
