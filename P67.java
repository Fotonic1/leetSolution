public class P67 {
    public static String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();
        boolean add = false;

        int ai = a.length() - 1;
        int bi = b.length() - 1;

        char ch;
        while (ai >= 0 || bi >= 0) {
            char r = '0';
            if (add) {
                r = '1';
                add = false;
            }

            if (ai >= 0) {
                ch = a.charAt(ai);
                if (ch == '1') {
                    if (r == '1') {
                        add = true;
                        r = '0';
                    } else r = '1';
                }
            }
            if (bi >= 0) {
                ch = b.charAt(bi);
                if (ch == '1') {
                    if (r == '1') {
                        add = true;
                        r = '0';
                    } else r = '1';
                }
            }
            builder.append(r);
            ai--;
            bi--;
        }

        if (add) builder.append('1');

        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("101", "101"));
    }

}
