class Solution {
    public boolean isPalindrome(int x) {
        int current=x,reversed=0;
        if(x<0)
        {
            return false;
        }
        while(x!=0)
        {
            int rem=x%10;
            reversed=reversed*10+rem;
            x=x/10;
            }
        return current==reversed;
    }
    public static void main(String st[]) {
        Solution s = new Solution();
        s.isPalindrome(101);
    }
}