import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class P15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int before = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (nums[i] == before) continue;

            before = nums[i];

            int j = i + 1;
            int p = nums.length - 1;
            while (j < p) {

                int sum = nums[i] + nums[j] + nums[p];
                if (sum > 0) {
                    int o = nums[p];
                    while (p >= 0 && nums[p] == o) {
                        p--;
                    }
                } else if (sum < 0) {
                    int o = nums[j];
                    while (j < nums.length && nums[j] == o) {
                        j++;
                    }
                } else {
                    res.add(Arrays.asList(nums[i],nums[j],nums[p]));
                    int o = nums[j];
                    while (j < nums.length && nums[j] == o) {
                        j++;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
    }
}
