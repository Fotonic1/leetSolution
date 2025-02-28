public class P605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;

        int p, c, next;
        for(int i = 0; i < flowerbed.length; i++) {
            p = i > 0 ? flowerbed[i-1] : 0;
            c = flowerbed[i];
            next = i + 1 < flowerbed.length ? flowerbed[i+1] : 0;

            if (next == 0 && c == 0 && p == 0) {
                n--;
                i++;
                if (n == 0) {
                    return true;
                }
            } else if (c == 1)i++;
            else if (p == 1) i += 2;
        }

        return false;
    }
}
