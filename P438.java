import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        if (p.length() > s.length()) return res;

        int[] pc = new int[26];
        int[] sc = new int[26];
        int i = 0;

        for (char c : p.toCharArray()) {
            pc[c - 'a']++;
        }

        while (i < p.length()) {
            sc[s.charAt(i) - 'a']++;
            i++;
        }

        if (Arrays.equals(pc, sc)) res.add(i - p.length());

        while (i < s.length()) {
            sc[s.charAt(i) - 'a']++;
            sc[s.charAt(i-p.length()) - 'a']--;

            i++;
            if (Arrays.equals(pc, sc)) res.add(i - p.length());
        }
        return res;
    }

    public static void main(String[] args) {
        P438 t = new P438();
        System.out.println(t.findAnagrams("abab", "ab"));
    }
}
