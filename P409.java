public class P409 {
    public static int longestPalindrome(String s) {
        int[] l = new int[60];
        int res = 0;
        for (char c : s.toCharArray()) {
            if (++l[c - 'A'] % 2 == 0) res += 2;
        }
        if (res < s.length()) res++;
        return res;
    }

    public static void main(String[] args) {
//        System.out.println(longestPalindrome("a"));
        System.out.println('z'-'A');

    }
}
