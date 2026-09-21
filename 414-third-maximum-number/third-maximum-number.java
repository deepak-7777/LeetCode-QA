class Solution {
    public int thirdMax(int[] nums) {
        Long f = null;  // first 
        Long s = null;  // second
        Long t = null;  // third 

        for (int num : nums) {
            if ((f != null && num == f) ||       // Duplicate values ignore
                (s != null && num == s) ||
                (t != null && num == t)) {
                continue;
            }
            if (f == null || num > f) {
                t = s;
                s = f;
                f = (long) num;
            } 
            else if (s == null || num > s) {
                t = s;
                s = (long) num;
            } 
            else if (t == null || num > t) {
                t = (long) num;
            }
        }
        // Agar third maximum exist nahi karta
        return (t == null) ? f.intValue() : t.intValue();
    }
}