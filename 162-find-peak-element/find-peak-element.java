class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // Peak right side me hoga
                left = mid + 1;
            } else {
                // Peak left side me (including mid) hoga
                right = mid;
            }
        }

        return left; // ya right, dono same honge
    }
}