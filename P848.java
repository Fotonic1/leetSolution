public class P848 {
    public String shiftingLetters(String s, int[] shifts) {
        int p = 0;
        char[] chars = s.toCharArray();
        for (int i = shifts.length -1; i >= 0; i--) {
            p = (p + shifts[i]) % 26;
            chars[i] = (char) ('a' + (chars[i] - 'a' + p) % 26);
        }

        return new String(chars);
    }
}
