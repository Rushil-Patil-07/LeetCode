import java.util.ArrayList;
class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(nums[0]);
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] != nums[i + 1]) {
                list.add(nums[i + 1]);
            }
            i++;
        }
        for (int j = 0; j < list.size(); j++) {
            nums[j] = list.get(j);
        }
        return list.size();
    }
}