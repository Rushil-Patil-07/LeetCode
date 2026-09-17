class Solution {
    public String finalString(String s) {
        String newString = "";
        StringBuffer sb = new StringBuffer(s);
        StringBuffer sb2 = new StringBuffer(newString);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != 'i') {
                sb2.append(sb.charAt(i));
            } else {
                sb2.reverse();
            }
        }
        return sb2.toString();
    }
}