
public class P3 {
    public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        int [] chars = new int[128];
        int cur = 0;
        int last = 1;
        for (int i = 1; i <= s.length(); i++) {
            if (chars[s.charAt(i-1)] < last) {
                chars[s.charAt(i-1)] = i;
                cur++;
            } else {
                last = chars[s.charAt(i-1)];
                res = Math.max(res, cur);
                cur = i - last;
                chars[s.charAt(i-1)] = i;
            }
        }
        return Math.max(res, cur);
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("anviaj"));
    }
}
