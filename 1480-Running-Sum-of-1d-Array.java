import java.util.Arrays;
class Solution {
    public int[] runningSum(int[] nums) {
        int i = 0, j = i + 1;
        int[] final_arr = new int[nums.length];
        final_arr[0] = nums[0];
        while (j < nums.length) {
            final_arr[j] = final_arr[i] + nums[j];
            i++;
            j++;
        }
        return final_arr;
    }
}