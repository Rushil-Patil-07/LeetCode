class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        int[] arr = new int[2];
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }
        }
        arr[0] = start;
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                start = mid + 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }
        }
        arr[1] = end;
        if (arr[0] > arr[1]) {
            return new int[]{-1, -1};
        }
        return arr;
    }
}