import java.util.HashMap;
import java.util.Map;

public class P169 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        return map.entrySet().stream().filter(e -> e.getValue() > nums.length/2).map(Map.Entry::getKey).findAny().orElse(0);
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,5,3,2,2}));
    }

}
