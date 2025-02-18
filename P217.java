import java.util.HashSet;
import java.util.Set;

public class P217 {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
    }

}
