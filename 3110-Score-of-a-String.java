class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        int i = 0;
        int j = i + 1;
        while (i < j && j < s.length()) {
            sum = sum + (Math.abs((int) s.charAt(i) - (int) s.charAt(j)));
            i++;
            j++;
        }
        return sum;
    }
}