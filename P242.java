public class P242 {
    public static boolean isAnagram(String s, String t) {
        if (s.length()!= t.length()) return false;
        int[] letters = new int[26];
        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            letters[c - 'a']--;
            if (letters[c - 'a'] < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
    }
}
