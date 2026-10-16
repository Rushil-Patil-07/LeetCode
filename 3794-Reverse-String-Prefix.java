class Solution {
    public String reversePrefix(String s, int k) {
        String result = "";
        result = s.substring(0, k);
        StringBuilder sb = new StringBuilder(result);
        sb.reverse();
        sb.append(s.substring(k, s.length()));
        return sb.toString();
    }
}