public class P7 {
    public static int reverse(int x) {
        int rev = 0;
        int t;
        while (x != 0) {
            t = x % 10;
            x = x / 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && t > 8) ||
                    rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && t < -7)
            ) return 0;
            rev = (rev * 10) + t;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
