public class P121 {
    public static int maxProfit(int[] prices) {
        int res = 0;
        int left = 0;
        int right = 1;
        while (right < prices.length) {
            int cur = prices[right] - prices[left];
            if (res < cur) res = cur;
            else if (cur < 0) {
                left = right;
            }
            right++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

}
