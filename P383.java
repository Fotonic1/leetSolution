public class P383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] letters = new int[26];
        for (char c : magazine.toCharArray()) {
            letters[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (letters[c - 'a'] < 1) return false;
            letters[c - 'a']--;
        }

        return true;
    }

    public static void main(String[] args) {
    }
}
