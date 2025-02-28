import java.util.Set;

public class P1456 {
    public int maxVowels(String s, int k) {
        Set<Character> chars = Set.of('a','e', 'o', 'i', 'u');

        int c = 0;
        for (int i = 0; i < k; i++) {
            if (chars.contains(s.charAt(i))) c++;
        }
        int max = c;

        for (int i = k; i < s.length(); i++) {
            if (chars.contains(s.charAt(i))) c++;
            if (chars.contains(s.charAt(i - k))) c--;
            max = Math.max(max, c);
        }

        return max;
    }
}
