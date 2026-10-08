class Solution {
    public void sortColors(int[] nums) {
        int count_A = 0;
        int count_B = 0;
        int count_C = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count_A++;
            } else if (nums[i] == 1) {
                count_B++;
            } else {
                count_C++;
            }
        }
        for (int i = 0; i < count_A; i++) {
            nums[i] = 0;
        }
        for (int i = count_A; i < count_A + count_B; i++) {
            nums[i] = 1;
        }
        for (int i = count_A + count_B; i < nums.length; i++) {
            nums[i] = 2;
        }
    }
}