class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int left = 0;
        int count = 0;

        while (left < n) {
            if(nums[left] > nums[(left +1) % n]){  // % n isliye use kiya hai taaki last element ke baad  first element par aa sake (circular check)
                count++;
            }
            left++; 
        }
        return count <= 1;   /// break agar 1 se jyada hua to possible nahi hai 
    }
}