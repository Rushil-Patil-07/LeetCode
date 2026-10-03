class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        int highest = start;

        start = 0;
        end = highest;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = mountainArr.get(mid);
            if (val == target) {
                return mid;
            } else if (target > val) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        start = highest;
        end = mountainArr.length() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = mountainArr.get(mid);
            if (val == target) {
                return mid;
            } else if (target < val) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}