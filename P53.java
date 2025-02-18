import java.util.HashSet;
import java.util.Set;

public class P53 {
    public static int maxSubArray(int[] nums) {
        int max = nums[0], sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(sum, max);
            if (sum < 0) sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
    }

}
