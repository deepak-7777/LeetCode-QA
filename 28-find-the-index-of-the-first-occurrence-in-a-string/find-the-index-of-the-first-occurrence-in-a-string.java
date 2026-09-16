class Solution {
    public int strStr(String haystack, String needle) {
      int n = haystack.length();
      int m = needle.length();

      for (int i = 0; i <= n - m; i++) {  // last valid starting position
        int j;
        for (j = 0; j < m; j++) {   // compare needle chars
            if(haystack.charAt(i + j) != needle.charAt(j)) {
                break;    // mismatch found
            }
        }
        if (j == m) {
            return i;
        }
      }
      return -1;
    }
}