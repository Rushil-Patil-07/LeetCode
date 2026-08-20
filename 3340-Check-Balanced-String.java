import java.lang.*;
class Solution {
    public boolean isBalanced(String num) {
        int i,even=0,odd=0;
        for(i=0;i<num.length();i++)
        {
            if(i%2==0)
            {
                odd=num.charAt(i)+odd-48;
            }
            else
            {
                even=num.charAt(i)+even-48;
            }
        }
       return even==odd;
    }
}