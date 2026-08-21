class Solution {
    public boolean isMonotonic(int[] nums) {
    int i=0,r=0,j=i+1,s=r+1,flag1=1,flag2=1;
    while(i<nums.length-1) {
        if(nums[i]<=nums[j])
        {
            i++;
            j++;
            flag1=1;
        }
        else {
            flag1=0;
            break;
        }
    }
    while(r<nums.length-1) {
        if(nums[r]>=nums[s])
        {
            r++;
            s++;
            flag2=1;
        }
        else {
            flag2=0;
            break;
        }
    }
    if(flag1==1 || flag2==1)
    {
        return true;
    }
    else {
        return false;
    }
    }
}