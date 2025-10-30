public class P151 {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();

        s = s.trim();

        String[] strs = s.split(" +");
        for (int i = strs.length-1; i >= 0; i--) {
            result.append(strs[i]).append(" ");
        }

        result.deleteCharAt(result.length()-1);

        return result.toString();
    }
}
