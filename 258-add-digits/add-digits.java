class Solution {
    public int addDigits(int num) {
        while (num >= 10) {        // repeat until single digit
            int sum = 0;
            while (num > 0) {
                sum = sum + (num % 10);  // Last digit nikal kar sum me add
                num = num / 10;          // Last digit hata do
            }
            num = sum;      // Digits ke sum ko wapas num me store karo        
        }
        return num;
    }
   
}