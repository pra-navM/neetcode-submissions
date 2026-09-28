class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2; // Avoid potential overflow

            if (target == nums[m]) return m;

            if (nums[l] <= nums[m]) { // Left side is sorted
                if (nums[l] <= target && target < nums[m]) {
                    // Target is within the left sorted portion
                    r = m - 1;
                } else {
                    // Target is in the right portion
                    l = m + 1;
                }
            } else { // Right side is sorted
                if (nums[m] < target && target <= nums[r]) {
                    // Target is within the right sorted portion
                    l = m + 1;
                } else {
                    // Target is in the left portion
                    r = m - 1;
                }
            }
        }

        return -1; // Target not found
    }
}
