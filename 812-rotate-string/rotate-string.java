class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {   // length check
            return false;
        }
        String doubled = s + s;               //  doubled = "abcdeabcde";

        return doubled.contains(goal);         // goal present hai ki nahi 
    }
}