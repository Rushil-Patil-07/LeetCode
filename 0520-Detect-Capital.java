class Solution {
    public boolean detectCapitalUse(String word) {
    int Lower_count = 0;
    for(int i=0;i<word.length();i++)
    {
        if(Character.isLowerCase(word.charAt(i)))
        {
            Lower_count++;
        }
    }
    if(Lower_count == word.length())
    {
        return true;
    }
    else if(Lower_count == 0)
    {
        return true;
    }
    else if(Character.isUpperCase(word.charAt(0)) && (Lower_count == word.length()-1))
    {
        return true;
    }
    return false;
    }
}