import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String original = words[i];
            for (int j = 0; j < dictionary.size(); j++) {
                if (original.startsWith(dictionary.get(j)) && dictionary.get(j).length() < words[i].length()) {
                    words[i] = dictionary.get(j);
                }
            }
        }
        String result = String.join(" ", words);
        return result;
    }
}