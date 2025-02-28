public class P8 {
    public int myAtoi(String s) {
        long res = 0L;
        boolean negative = false;
        boolean start = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                if (!start) {
                    if (s.charAt(i) == ' ') continue;
                    else if (s.charAt(i) == '-' || s.charAt(i) == '+') {
                        start = true;
                        if (s.charAt(i) == '-') negative = true;
                    } else break;
                } else break;
            } else {
                start = true;
                int d = Character.digit(s.charAt(i), 10);
                res = res * 10 + d;

                if (negative && -res <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
                else if (!negative && res >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
            }
        }

        return negative ? (int)-res : (int)res;
    }

    public static void main(String[] args) {
        P8 c = new P8();
        System.out.println(c.myAtoi("-2147483647"));
    }
}
