class Solution {
    public String firstPalindrome(String[] words) {
        int n = words.length;

        for (int i = 0; i < n; i++) {
            int left = 0;                        // start pointer
            int right = words[i].length() - 1;   // end pointer

            boolean palindrome = true;

            while (left < right) {
                if (words[i].charAt(left) != words[i].charAt(right)) {   // chars mismatch
                    palindrome = false;
                    break;
                }

                left++;
                right--;
            }

            if (palindrome) {      // first palindrome found
                return words[i];
            }
        }
        return "";
    }
}