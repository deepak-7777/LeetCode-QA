class Solution {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        String temp = word;

        while (sequence.contains(temp)) {   // sequence.contains("ab")
            count++;
            temp += word;             // temp = "ab" + "ab"
        }
        return count;
    }
}