public class P6 {
    public static String convert(String s, int numRows) {
        if (s.length() == 1 || numRows == 1 || s.length() <= numRows) {
            return s;
        }
        StringBuilder[] builders = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            builders[i] = new StringBuilder();
        }

        int row = 0;
        boolean down = true;
        for (int i = 0; i < s.length(); i++) {
            builders[row].append(s.charAt(i));
            if (down) {
                row++;
                if (row == numRows - 1){
                    down = false;
                }
            } else {
                row--;
                if (row == 0) {
                    down = true;
                }
            }
        }

        StringBuilder result = new StringBuilder();

        for (StringBuilder builder : builders) {
            result.append(builder);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",3));
    }
}
