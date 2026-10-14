import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c = s.toCharArray();
        char[] c1 = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        if (s.length() != t.length()) {
            return false;
        } else if (Arrays.equals(c, c1)) {
            return true;
        }
        return false;
    }
}