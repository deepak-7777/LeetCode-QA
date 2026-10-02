class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;

        while (j < typed.length()) {
            // Current characters match
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            }
            // Current typed character is a long press of previous character
            else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            }
            // Invalid character
            else {
                return false;
            }
        }
        // All characters of name must be matched
        return i == name.length();
    }
}