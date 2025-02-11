import java.util.Arrays;

public class P704 {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (target > nums[mid]) left = mid + 1;
            else if (target < nums[mid]) right = mid  -1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{5}, 5));
    }
}
