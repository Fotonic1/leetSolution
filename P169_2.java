import java.util.HashMap;
import java.util.Map;

public class P169_2 {
    public static int majorityElement(int[] nums) {
        int c = 0;
        int el = 0;

        for (int num : nums) {
            if (c == 0) {
                el = num;
                c++;
            } else if (el == num) c++;
             else c--;
        }

        return el;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,5,3,2,2}));
    }

}
