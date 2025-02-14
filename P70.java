public class P70 {
    public static int climbStairs(int n) {
        if (n < 2) return 1;
        if (n == 2) return 2;
        int t = 1;
        int o = 2;
        int ways = 0;
        for (int i = 2; i < n; i++) {
            ways = t + o;
            t = o;
            o = ways;
        }
        return ways;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }
}
