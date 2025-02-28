public class P5Palindrome {
    public static String longestPalindrome(String s) {
        if (s.length() <= 1) return s;

        String res = s.substring(0, 1);
        int max = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            int rad = 1;
            while (i - rad >= 0 && i + rad <= s.length()) {
                if (s.charAt(i - rad) == s.charAt(i + rad)) rad++;
                else {
                    break;
                }
            }

            rad--;

            int cur = 1 + rad*2;
            if (max < cur) {
                max = cur;
                res = s.substring(i - rad + 1, i + rad);
            }

            int next = i + 1;
            if (next < s.length() && s.charAt(i) == s.charAt(next)) {
                rad = 1;
                while (i - rad >= 0 && i + rad + 1  <= s.length()) {
                    if (s.charAt(i - rad) == s.charAt(next + rad)) rad++;
                    else {
                        rad--;
                        break;
                    }
                }

                cur = 2 + rad*2;
                if (max < cur) {
                    max = cur;
                    res = s.substring(i - rad, next + 1 + rad);
                }
            }
        }

        return res;
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
