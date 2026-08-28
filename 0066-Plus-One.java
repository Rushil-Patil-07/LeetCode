import java.util.Arrays;
class Solution{
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9)
            {
              digits[i]=0;
            }
            else {
                digits[i]=digits[i]+1;
                break;
            }
        }
        int[] new_arr = new int[digits.length+1];
        int i=0,sum=0;
        while(i<digits.length){
            sum=sum+digits[i];
            i++;
        }
        if(sum==0)
        {
            new_arr[0]=1;
        }
        if(sum==0)
        {
            return new_arr;
        }
        else {
            return digits;
        }
    }
}