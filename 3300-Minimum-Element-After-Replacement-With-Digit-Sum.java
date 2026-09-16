import java.util.Arrays;
class Solution {
    public int minElement(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            while(nums[i]!=0)
            {
                int rem=nums[i]%10;
                sum=sum+rem;
                nums[i]=nums[i]/10;
            }
            nums[i]=sum;
            sum=0;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}