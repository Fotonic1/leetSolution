public class P485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c, n, p;
        int max = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) temp++;
            else {
                if (temp > max) max = temp;
                temp = 0;
            }
        }

        return temp > max ? temp : max;
    }
}
