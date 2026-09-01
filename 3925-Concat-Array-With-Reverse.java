import java.util.Arrays;

class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] reversed = nums.clone();
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int temp = reversed[i];
            reversed[i] = reversed[j];
            reversed[j] = temp;
            i++;
            j--;
        }
        int[] final_arr = new int[nums.length * 2];
        for (int k = 0; k < nums.length; k++) {
            final_arr[k] = nums[k];
            final_arr[k + nums.length] = reversed[k];
        }
        return final_arr;
    }
}