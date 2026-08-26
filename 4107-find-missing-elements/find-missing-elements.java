import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        // Minimum aur Maximum value find karne ke liye
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        // Range ke sabhi numbers ko track karne ke liye boolean array
        boolean[] present = new boolean[max - min + 1];
        for (int i = 0; i < nums.length; i++) {
            present[nums[i] - min] = true;
        }

        List<Integer> ans = new ArrayList<>();

        // Boolean array check karo
        for (int i = 0; i < present.length; i++) {
            if (present[i] == false) {
                ans.add(i + min);
            }
        }
        return ans;
    }
}