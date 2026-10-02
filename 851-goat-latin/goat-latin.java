class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        String vowels = "aeiouAEIOU";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (vowels.indexOf(word.charAt(0)) != -1) {
                word = word + "ma";
            } else {
                word = word.substring(1) + word.charAt(0) + "ma";
            }

            // Add 'a' according to word index (1-based)
            for (int j = 0; j <= i; j++) {
                word += "a";
            }

            result.append(word);

            if (i < words.length - 1) {   // space ke liye
                result.append(" ");
            }
        }
        return result.toString();
    }
}