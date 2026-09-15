class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int left = 0;
        int count = 0;

        while (left < n) {
            if(nums[left] > nums[(left +1) % n]){
                count++;
            }
            left++;
        }
        return count <= 1;
    }
}