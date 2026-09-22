import java.util.ArrayList;
import java.util.List;
class Solution {
    ArrayList<Integer> list=new ArrayList<>();
    public List<Integer> findWordsContaining(String[] words, char x) {
    for(int i=0;i<words.length;i++)
    {
        for(int j=0;j<words[i].length();j++)
        {
            if(words[i].charAt(j)==x)
            {
                list.add(i);
                break;
            }
        }
    }
    return list;
    }
}