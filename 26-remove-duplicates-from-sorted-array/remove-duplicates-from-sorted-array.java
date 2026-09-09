class Solution {
    public int removeDuplicates(int[] nums) {

        int[] temp = new int[nums.length];
        int k = 0;

        for(int i = 0; i < nums.length; i++) {
            boolean duplicate = false;
            for(int j = 0; j < i; j++) {
                if(nums[i] == nums[j]) {
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate) {
                temp[k++] = nums[i];
            }
        }
        for(int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
        return k;
    }
}