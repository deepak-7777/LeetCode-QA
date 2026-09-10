class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim(); // start aur end ke spaces (remove)
        String[] words = s.split(" "); // string ko words me todna 
        int n = words.length - 1;

        return words[n].length(); // last word ki length
    }
}