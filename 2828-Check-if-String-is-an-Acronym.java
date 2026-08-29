import java.util.List;
class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < words.size(); j++) {
                sb.append(words.get(j).charAt(0));
            }
            break;
        }
        return sb.toString().equals(s);
    }
}