public class P125 {
    public static boolean isPalindrome(String s)  {
        int left = 0;
        int right = s.length()-1;
        s = s.toLowerCase();
        while (left < right) {
            if (!((s.charAt(left) >= 'a' && s.charAt(left) <= 'z') || (s.charAt(left) >= '0' && s.charAt(left) <= '9'))) left++;
            else if (!((s.charAt(right) >= 'a' && s.charAt(right) <= 'z') || (s.charAt(right) >= '0' && s.charAt(right) <= '9'))) right--;
            else {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0p"));
        System.out.println(isPalindrome("race a car"));
    }

}
