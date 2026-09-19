class Solution {
    public boolean isIsomorphic(String s, String t) {
       
    if (s.length() != t.length()) {
        return false;
    }

    HashMap<Character, Character> map1 = new HashMap<>();      // s -> t mapping
    HashMap<Character, Boolean> map2 = new HashMap<>();   // t ke use characters track karne

    for (int i = 0; i < s.length(); i++) {
        char ch1 = s.charAt(i);
        char ch2 = t.charAt(i);

        if (map1.containsKey(ch1) == true) {      // Agar ch1 pehle se mapped hai
            if (map1.get(ch1) != ch2) {    // Mapping mismatch
                return false;
            }
        } else {
            if (map2.containsKey(ch2)) {   // ch2 kisi aur char ko already assigned hai
                return false;
            }

            map1.put(ch1, ch2);     // Nayi mapping banao
            map2.put(ch2, true);
        }
    }
    return true;
    }
}