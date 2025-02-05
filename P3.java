import java.util.HashMap;
import java.util.Map;

public class P3 {
    public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        Map<Character, Integer> sub= new HashMap<>();
        int cur = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer lastIndex = sub.put(c,i);
            if (lastIndex == null) {
                cur++;
            } else {
                res = Math.max(res, cur);
                i = lastIndex;
                cur = 0;
                sub.clear();
            }
        }
        return Math.max(res, cur);
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
