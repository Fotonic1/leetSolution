public class P31 {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        while (i >= 0 && nums[i+1] <= nums[i]) i--;

        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) j--;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        i++;
        int j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
