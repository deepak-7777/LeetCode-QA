class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase())) {
            return true; // All uppercase
        }

        if (word.equals(word.toLowerCase())) {
            return true; // All lowercase
        }

        if (Character.isUpperCase(word.charAt(0)) &&
            word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true; // First letter uppercase, rest lowercase
        }

        return false;
    }
}