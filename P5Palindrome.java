public class P5Palindrome {
    public static String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        int[] pal = new int[s.length()];
        int[] palMiddle = new int[s.length()];
        int center = s.length() / 2;
        int max = 1;
        String result = String.valueOf(s.charAt(0));
        for (int i = 0; i < (pal.length + 1) / 2; i++) {
            pal[center + i] = countPal(center + i, s);
            if (max < pal[center + i]) {
                max = pal[center + i];
                result = s.substring(center + i - (max / 2), center + i + (max / 2) + 1);
            }

            palMiddle[center + i] = countPalMiddle(center + i, center + i + 1, s);
            if (max < palMiddle[center + i]) {
                max = palMiddle[center + i];
                result = s.substring(center + i - (max / 2) + 1, center + i + (max / 2) + 1);
            }

            palMiddle[center + i - 1] = countPalMiddle(center + i - 1, center + i, s);
            if (max < palMiddle[center + i - 1]) {
                max = palMiddle[center + i - 1];
                result = s.substring(center + i - (max / 2), center + i + (max / 2));
            }

            if (i > 0) {
                pal[center - i] = countPal(center - i, s);
                if (max < pal[center - i]) {
                    max = pal[center - i];
                    result = s.substring(center - i - (max / 2), center - i + (max / 2) + 1);
                }

                palMiddle[center - i] = countPalMiddle(center - i, center - i + 1, s);
                if (max < palMiddle[center - i]) {
                    max = palMiddle[center + i];
                    result = s.substring(center - i - (max / 2), center - i + (max / 2));
                }

                if (center - i - 1 >= 0) {
                    palMiddle[center - i - 1] = countPalMiddle(center - i - 1, center - i, s);
                    if (max < palMiddle[center - i - 1]) {
                        max = palMiddle[center - i - 1];
                        result = s.substring(center - i - (max / 2), center - i + (max / 2));
                    }
                }
            }
        }
        return result;
    }

    private static int countPal(int index, String s) {
        int result = 1;
        int rad = 1;
        while (index - rad >= 0 && index + rad < s.length()) {
            if (s.charAt(index + rad) == s.charAt(index - rad)) {
                rad++;
            } else {
                rad--;
                break;
            }
        }
        if (index - rad < 0 || index + rad >= s.length()) {
            rad--;
        }

        return result + (rad * 2);
    }


    private static int countPalMiddle(int index1, int index2, String s) {
        if (index1 < 0 || index2 >= s.length()) {
            return 0;
        }
        int rad = 0;
        while (index1 - rad >= 0 && index2 + rad < s.length()) {
            if (s.charAt(index1 - rad) == s.charAt(index2 + rad)) {
                rad++;
            } else {
                break;
            }
        }
        return (rad * 2);
    }

    public static void main(String[] args) {
//        System.out.println(longestPalindrome("abcbe"));
//        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
    }
}
