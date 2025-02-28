public class P424 {
    public int characterReplacement(String s, int k) {
        int l = 0, maxCount = 0;
        int[] chars = new int[26];

        for (int r = 0; r < s.length(); r++) {
            chars[s.charAt(r) - 'A']++;

            maxCount = Math.max(maxCount, chars[s.charAt(r) - 'A']);

            if (r - l + 1 - maxCount > k) {
                chars[s.charAt(l++) - 'A']--;
            }
        }

        return Math.min(maxCount + k, s.length());
    }

    public static void main(String[] args) {
        P424 t = new P424();
        System.out.println(t.characterReplacement("KJRGKSKKOK", 5));
    }
}
