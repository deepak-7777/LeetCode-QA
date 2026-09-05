class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int idx = 0;

        for (int i = 0; i < n; i++) {
            char ch = chars[i];
            int count = 0;

            // Same characters count karo
            while (i < n && chars[i] == ch) {
                count++;
                i++;
            }

            // Character store karo
            chars[idx++] = ch;

            // Agar count > 1 hai to count bhi store karo
            if (count > 1) {
                String str = String.valueOf(count);

                for (char digit : str.toCharArray()) {
                    chars[idx++] = digit;
                }
            }

            i--; // for loop ke extra increment ko balance karne ke liye
        }

        return idx;
    }
}