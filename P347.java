import java.util.*;

public class P347 {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        Arrays.sort(nums);
        int current = nums[0];
        int count = 1;
        int maxCount = 0;

        for (int i = 1; i < nums.length; i++){
            if (nums[i] != current) {
                map.putIfAbsent(count, new ArrayList<>());
                map.get(count).add(current);
                current = nums[i];
                maxCount = Math.max(count, maxCount);
                count = 1;
            } else count++;
        }

        map.putIfAbsent(count, new ArrayList<>());
        map.get(count).add(current);

        int i = 0;
        while (i < k && maxCount > 0) {
            if (map.containsKey(maxCount)) {
                List<Integer> list = map.get(maxCount);
                for(int value: list) {
                    if (i == k) break;
                    res[i++] = value;
                }
            } else maxCount--;
        }


        return res;
    }
}
