import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
         s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return checkPalindrome(0, s);
    }
    private boolean checkPalindrome(int i, String s) {
        if (i >= s.length() / 2)
            return true;
        if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;
        return checkPalindrome(i + 1, s);
    }
}
