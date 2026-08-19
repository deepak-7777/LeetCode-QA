class Solution {
    public String reverseWords(String s) {

        s = s.trim();      // remove the extra spaces 
        String[] words = s.split("\\s+");     // String ko tukdo (parts) me tod deta hai.

        StringBuilder result = new StringBuilder();
        
        for(int i = words.length - 1; i >= 0; i--){
            result.append(words[i]);
            if(i != 0){       // last word pe space add nahi karna hai reverse ke baad 
                result.append(" "); 
            }
        }
        return result.toString();     // stringBuilder  ko string mai convert karne ke liye 
    }
}