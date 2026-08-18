import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // nums1 ke unique elements jo nums2 me nahi hain
        for (int i = 0; i < nums1.length; i++) {

            boolean found = false;

            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    found = true;
                    break;
                }
            }

            if (!found && !list1.contains(nums1[i])) {
                list1.add(nums1[i]);  // duplicate values ko result me add hone se rokna
            }
        }

        // nums2 ke unique elements jo nums1 me nahi hain
        for (int i = 0; i < nums2.length; i++) {

            boolean found = false;

            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    found = true;
                    break;
                }
            }

            if (!found && !list2.contains(nums2[i])) {       
                list2.add(nums2[i]);       // duplicate values ko result me add hone se rokna
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(list1);
        answer.add(list2);

        return answer;
    }
}