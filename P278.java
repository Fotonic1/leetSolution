public class P278 {
    public static int firstBadVersion(int n) {
        if (n == 1) return n;
        int first = 1;
        while (first < n) {
            int mid = first + ((n - first) / 2);
            if (isBadVersion(mid)) n = mid;
            else first = mid + 1;
        }
        return first;
    }

    public static boolean isBadVersion(int n) {
        return true;
    }

    public static void main(String[] args) {
    }
}
