class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuffer sb = null;
        String result = "";
        StringBuffer sb1 = new StringBuffer(result);
        for (int i = 0; i < arr.length; i++) {
            sb = new StringBuffer(arr[i]);
            sb.reverse();
            sb1.append(sb + " ");
        }
        return sb1.toString().trim();
    }
}