import java.util.*;

public class P18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        return kSum(nums, target, 0, 4);
    }

    public List<List<Integer>> kSum(int[] nums, long target, int start, int k) {
        List<List<Integer>> res = new ArrayList<>();

        if (nums[start] > target/k || target/k > nums[nums.length - 1]) return res;

        if (k == 2) {
            return twoSum(nums, target, start);
        }

        while (start <= nums.length - k) {
            List<List<Integer>> temp = kSum(nums, target - nums[start], start + 1, k - 1);
            for (List<Integer> t : temp) {
                t.add(nums[start]);
            }
            res.addAll(temp);
            while (start < nums.length - 1 && nums[start++] == nums[start]);
        }

        return res;
    }

    public List<List<Integer>> twoSum(int[] nums, long target, int start) {
        List<List<Integer>> res = new ArrayList<>();
        int l = start, r = nums.length - 1;

        while (l < r) {
            long sum = nums[l] + nums[r];
            if (sum > target || (r < nums.length -1 && nums[r] == nums[r+1]) ) r--;
            else if (sum < target || (l > start && nums[l] == nums[l-1])) l++;
            else res.add(new ArrayList<>(List.of(nums[l++], nums[r--])));
        }

        return res;
    }

    public static void main(String[] args) {
        P18 t = new P18();
        t.fourSum(new int[]{-1000000000,-1000000000,1000000000,-1000000000,-1000000000}, 294967296);
    }
}
