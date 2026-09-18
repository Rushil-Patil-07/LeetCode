import java.util.Arrays;
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr2 = new int[2 * n];
        int j = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            arr2[i] = nums[j];
            arr2[i + 1] = nums[j + n];
            j++;
        }
        return arr2;
    }
}