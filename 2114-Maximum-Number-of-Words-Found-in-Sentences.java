class Solution {
    public int mostWordsFound(String[] sentences) {
    int i;
    String[] words;
    int max = 0;
    for(i=0;i<sentences.length;i++)
    {
        words=sentences[i].split(" ");
      // System.out.print(Arrays.toString(words));
      // System.out.println(" length:-"+words.length);
        if(words.length>max)
        {
            max=words.length;
        }
    }
        //System.out.println("Maximum words in sentence are:- "+max);
    return max;
    }
    public static void main(String st[])
    {
        String[] sentences={"Hii I am BOB!!","BOB is very good boy","Alice is the friend of BOB"};
    Solution s=new Solution();
    s.mostWordsFound(sentences);
    }
}