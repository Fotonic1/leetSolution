import java.util.*;

public class P49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Wrap, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] key = new int[26];
            for (char c : str.toCharArray()) {
                key[c - 'a']++;
            }
            Wrap wrap = new Wrap(key);

            if (!map.containsKey(wrap)) {
                map.put(wrap, new ArrayList<>(List.of(str)));
            } else {
                map.get(wrap).add(str);
            }
        }

        return new ArrayList<>(map.values());
    }

    private class Wrap{
        int[] key;

        public Wrap(int[] key) {
            this.key = key;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;

            Wrap wrap = (Wrap) o;
            return Arrays.equals(key, wrap.key);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(key);
        }
    }

    public static void main(String[] args) {
        P49 t = new P49();
        System.out.println(t.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}
